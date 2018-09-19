
package com.gog.applelo.gog.models.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("userSince")
    @Expose
    private Integer userSince;
    @SerializedName("avatars")
    @Expose
    private Avatars avatars;
    @SerializedName("friendStatus")
    @Expose
    private FriendStatus friendStatus;
    @SerializedName("wishlistStatus")
    @Expose
    private WishlistStatus wishlistStatus;
    @SerializedName("blockedStatus")
    @Expose
    private BlockedStatus blockedStatus;
    @SerializedName("chatStatus")
    @Expose
    private ChatStatus chatStatus;

    /**
     * No args constructor for use in serialization
     * 
     */
    public User() {
    }

    /**
     * 
     * @param id
     * @param username
     * @param chatStatus
     * @param blockedStatus
     * @param avatars
     * @param userSince
     * @param wishlistStatus
     * @param friendStatus
     */
    public User(String id, String username, Integer userSince, Avatars avatars, FriendStatus friendStatus, WishlistStatus wishlistStatus, BlockedStatus blockedStatus, ChatStatus chatStatus) {
        super();
        this.id = id;
        this.username = username;
        this.userSince = userSince;
        this.avatars = avatars;
        this.friendStatus = friendStatus;
        this.wishlistStatus = wishlistStatus;
        this.blockedStatus = blockedStatus;
        this.chatStatus = chatStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserSince() {
        return userSince;
    }

    public void setUserSince(Integer userSince) {
        this.userSince = userSince;
    }

    public Avatars getAvatars() {
        return avatars;
    }

    public void setAvatars(Avatars avatars) {
        this.avatars = avatars;
    }

    public FriendStatus getFriendStatus() {
        return friendStatus;
    }

    public void setFriendStatus(FriendStatus friendStatus) {
        this.friendStatus = friendStatus;
    }

    public WishlistStatus getWishlistStatus() {
        return wishlistStatus;
    }

    public void setWishlistStatus(WishlistStatus wishlistStatus) {
        this.wishlistStatus = wishlistStatus;
    }

    public BlockedStatus getBlockedStatus() {
        return blockedStatus;
    }

    public void setBlockedStatus(BlockedStatus blockedStatus) {
        this.blockedStatus = blockedStatus;
    }

    public ChatStatus getChatStatus() {
        return chatStatus;
    }

    public void setChatStatus(ChatStatus chatStatus) {
        this.chatStatus = chatStatus;
    }

}
