
package com.gog.applelo.gog.models.embed.reviews;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Author {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("avatarPath")
    @Expose
    private String avatarPath;
    @SerializedName("id")
    @Expose
    private String id;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Author() {
    }

    /**
     * 
     * @param id
     * @param name
     * @param avatarPath
     */
    public Author(String name, String avatarPath, String id) {
        super();
        this.name = name;
        this.avatarPath = avatarPath;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatarPath() {
        return avatarPath;
    }

    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
