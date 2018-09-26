
package com.gog.applelo.gog.models.notifications;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Payload {

    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("key")
    @Expose
    private String key;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Payload() {
    }

    /**
     * 
     * @param data
     * @param key
     */
    public Payload(Data data, String key) {
        super();
        this.data = data;
        this.key = key;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}
