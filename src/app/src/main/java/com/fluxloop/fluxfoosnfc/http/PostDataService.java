package com.fluxloop.fluxfoosnfc.http;

import com.fluxloop.fluxfoosnfc.model.NfcTag;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by jarle on 16.11.2018.
 */

public interface PostDataService {

    @POST("api/v1/nfc")
    Call<String> postData(@Body NfcTag nfcTag);

}
