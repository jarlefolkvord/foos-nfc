package com.fluxloop.fluxfoosnfc.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jarle on 16.11.2018.
 */


public class NfcTag {
    @SerializedName("id")
    private String id;

    public NfcTag(String id)
    {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
