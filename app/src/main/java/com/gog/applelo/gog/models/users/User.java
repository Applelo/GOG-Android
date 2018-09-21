
package com.gog.applelo.gog.models.users;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("created_date")
    @Expose
    private String createdDate;
    @SerializedName("avatar")
    @Expose
    private Avatar avatar;
    @SerializedName("is_employee")
    @Expose
    private Boolean isEmployee;
    @SerializedName("tags")
    @Expose
    private List<Object> tags = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public User() {
    }

    /**
     * 
     * @param tags
     * @param id
     * @param username
     * @param avatar
     * @param isEmployee
     * @param createdDate
     */
    public User(String id, String username, String createdDate, Avatar avatar, Boolean isEmployee, List<Object> tags) {
        super();
        this.id = id;
        this.username = username;
        this.createdDate = createdDate;
        this.avatar = avatar;
        this.isEmployee = isEmployee;
        this.tags = tags;
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

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Avatar getAvatar() {
        return avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }

    public Boolean getIsEmployee() {
        return isEmployee;
    }

    public void setIsEmployee(Boolean isEmployee) {
        this.isEmployee = isEmployee;
    }

    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

}
