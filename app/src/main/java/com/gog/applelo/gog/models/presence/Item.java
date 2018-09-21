
package com.gog.applelo.gog.models.presence;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("client_id")
    @Expose
    private String clientId;
    @SerializedName("user_id")
    @Expose
    private String userId;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Item() {
    }

    /**
     * 
     * @param userId
     * @param data
     * @param clientId
     */
    public Item(Data data, String clientId, String userId) {
        super();
        this.data = data;
        this.clientId = clientId;
        this.userId = userId;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
