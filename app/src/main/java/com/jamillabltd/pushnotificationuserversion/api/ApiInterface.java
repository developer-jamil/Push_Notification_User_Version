package com.jamillabltd.pushnotificationuserversion.api;

import static com.jamillabltd.pushnotificationuserversion.Constants.SERVER_KEY;
import static com.jamillabltd.pushnotificationuserversion.Constants.CONTENT_TYPE;

import com.jamillabltd.pushnotificationuserversion.model.PushNotification;

import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.Call;


public interface ApiInterface {//select interface java class creating time

    @Headers({"Authorization: key = " + SERVER_KEY, "Content-Type:" + CONTENT_TYPE})
    @POST("fcm/send")
    Call<PushNotification> sendNotification(@Body PushNotification notification);
}
