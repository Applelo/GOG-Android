
package com.gog.applelo.gog.models.chat.friends;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("is_employee")
    @Expose
    private Boolean isEmployee;
    @SerializedName("friend_status")
    @Expose
    private String friendStatus;
    @SerializedName("images")
    @Expose
    private Images images;
    @SerializedName("room")
    @Expose
    private Room room;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Item() {
    }

    /**
     * 
     * @param username
     * @param userId
     * @param images
     * @param isEmployee
     * @param room
     * @param friendStatus
     */
    public Item(String userId, String username, Boolean isEmployee, String friendStatus, Images images, Room room) {
        super();
        this.userId = userId;
        this.username = username;
        this.isEmployee = isEmployee;
        this.friendStatus = friendStatus;
        this.images = images;
        this.room = room;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getIsEmployee() {
        return isEmployee;
    }

    public void setIsEmployee(Boolean isEmployee) {
        this.isEmployee = isEmployee;
    }

    public String getFriendStatus() {
        return friendStatus;
    }

    public void setFriendStatus(String friendStatus) {
        this.friendStatus = friendStatus;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

}
