
package com.gog.applelo.gog.models.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PreferredLanguage {

    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PreferredLanguage() {
    }

    /**
     * 
     * @param name
     * @param code
     */
    public PreferredLanguage(String code, String name) {
        super();
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
