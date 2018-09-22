
package com.gog.applelo.gog.models.chat.invitations;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("friend_user_id")
    @Expose
    private String friendUserId;
    @SerializedName("date_created")
    @Expose
    private String dateCreated;
    @SerializedName("friend_username")
    @Expose
    private String friendUsername;
    @SerializedName("friend_is_employee")
    @Expose
    private Boolean friendIsEmployee;
    @SerializedName("friend_images")
    @Expose
    private FriendImages friendImages;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Item() {
    }

    /**
     * 
     * @param friendUserId
     * @param id
     * @param friendUsername
     * @param dateCreated
     * @param friendImages
     * @param friendIsEmployee
     */
    public Item(String id, String friendUserId, String dateCreated, String friendUsername, Boolean friendIsEmployee, FriendImages friendImages) {
        super();
        this.id = id;
        this.friendUserId = friendUserId;
        this.dateCreated = dateCreated;
        this.friendUsername = friendUsername;
        this.friendIsEmployee = friendIsEmployee;
        this.friendImages = friendImages;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFriendUserId() {
        return friendUserId;
    }

    public void setFriendUserId(String friendUserId) {
        this.friendUserId = friendUserId;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getFriendUsername() {
        return friendUsername;
    }

    public void setFriendUsername(String friendUsername) {
        this.friendUsername = friendUsername;
    }

    public Boolean getFriendIsEmployee() {
        return friendIsEmployee;
    }

    public void setFriendIsEmployee(Boolean friendIsEmployee) {
        this.friendIsEmployee = friendIsEmployee;
    }

    public FriendImages getFriendImages() {
        return friendImages;
    }

    public void setFriendImages(FriendImages friendImages) {
        this.friendImages = friendImages;
    }

}
