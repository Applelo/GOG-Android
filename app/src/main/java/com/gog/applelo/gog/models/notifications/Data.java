
package com.gog.applelo.gog.models.notifications;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("is_sender")
    @Expose
    private Boolean isSender;
    @SerializedName("event_date")
    @Expose
    private String eventDate;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("status")
    @Expose
    private String status;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Data() {
    }

    /**
     * 
     * @param id
     * @param isSender
     * @param eventDate
     * @param status
     * @param userId
     * @param user
     */
    public Data(String id, String userId, Boolean isSender, String eventDate, User user, String status) {
        super();
        this.id = id;
        this.userId = userId;
        this.isSender = isSender;
        this.eventDate = eventDate;
        this.user = user;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Boolean getIsSender() {
        return isSender;
    }

    public void setIsSender(Boolean isSender) {
        this.isSender = isSender;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
