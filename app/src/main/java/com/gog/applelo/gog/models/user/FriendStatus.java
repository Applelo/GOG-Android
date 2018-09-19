
package com.gog.applelo.gog.models.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FriendStatus {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("dateCreated")
    @Expose
    private Object dateCreated;
    @SerializedName("dateAccepted")
    @Expose
    private Object dateAccepted;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FriendStatus() {
    }

    /**
     * 
     * @param id
     * @param dateAccepted
     * @param status
     * @param dateCreated
     */
    public FriendStatus(String id, Integer status, Object dateCreated, Object dateAccepted) {
        super();
        this.id = id;
        this.status = status;
        this.dateCreated = dateCreated;
        this.dateAccepted = dateAccepted;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Object getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Object dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Object getDateAccepted() {
        return dateAccepted;
    }

    public void setDateAccepted(Object dateAccepted) {
        this.dateAccepted = dateAccepted;
    }

}
