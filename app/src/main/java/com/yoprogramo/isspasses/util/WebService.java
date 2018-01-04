package com.yoprogramo.isspasses.util;

import com.yoprogramo.isspasses.model.ISSPass;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface WebService {
    @GET("iss-pass.json")
    Observable<ISSPass> getInfo(@Query("lat") String lat, @Query("lon") String lon);
}