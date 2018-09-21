
package com.gog.applelo.gog.models.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class File_ {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("size")
    @Expose
    private Integer size;
    @SerializedName("downlink")
    @Expose
    private String downlink;

    /**
     * No args constructor for use in serialization
     * 
     */
    public File_() {
    }

    /**
     * 
     * @param id
     * @param downlink
     * @param size
     */
    public File_(Integer id, Integer size, String downlink) {
        super();
        this.id = id;
        this.size = size;
        this.downlink = downlink;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getDownlink() {
        return downlink;
    }

    public void setDownlink(String downlink) {
        this.downlink = downlink;
    }

}
