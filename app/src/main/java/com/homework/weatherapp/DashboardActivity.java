package com.homework.weatherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.homework.weatherapp.api.ApiClient;
import com.homework.weatherapp.api.ApiInterface;
import com.homework.weatherapp.model.MyResponse;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DashboardActivity extends AppCompatActivity {
    ApiInterface apiInterface;
    @BindView(R.id.etx_location)
    EditText etxLocation;

    @BindView(R.id.txt_weather)
    TextView txtWeather;
   public static final String APPID = "409e2c416bdf1bf973bd85cfafdde523";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        ButterKnife.bind(this);
        apiInterface = ApiClient.getClient().create(ApiInterface.class);

    }


@OnClick(R.id.btn_submit)
    public void submit(){
    getWeather(etxLocation.getText().toString());

}

    public void getWeather(String location){
      Call<MyResponse> call = apiInterface.getWeather(location, APPID);
      call.enqueue(new Callback<MyResponse>() {
          @Override
          public void onResponse(Call<MyResponse> call, Response<MyResponse> response) {
                MyResponse myResponse = response.body();
                txtWeather.append("NAME : " + myResponse.getName() + " Temp : " + myResponse.getWeather().temp +"F" );


          }

          @Override
          public void onFailure(Call<MyResponse> call, Throwable t) {
                txtWeather.append("Error");
          }
      });

    }










}

