package com.google.samples.quickstart.signin.govweather;

import com.google.samples.quickstart.signin.govweather.data.Body;
import com.google.samples.quickstart.signin.govweather.data.Response;
import com.google.samples.quickstart.signin.govweather.data.WetherSpcnwsInfoServiceVO;

import java.net.URI;
import java.net.URL;
import java.util.List;
import java.util.Map;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Created by jun on 2017-11-26.
 */

public interface  API {
    @GET("/service/WetherSpcnwsInfoService/WeatherInformation")
    Call<WetherSpcnwsInfoServiceVO> getWeatherInformation(
            @QueryMap(encoded = true) Map<String, String> options
    );
}
