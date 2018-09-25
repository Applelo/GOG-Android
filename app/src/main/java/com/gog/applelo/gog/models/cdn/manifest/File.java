
package com.gog.applelo.gog.models.cdn.manifest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class File {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("size")
    @Expose
    private Integer size;
    @SerializedName("hash")
    @Expose
    private String hash;
    @SerializedName("path")
    @Expose
    private String path;
    @SerializedName("offset")
    @Expose
    private Integer offset;

    /**
     * No args constructor for use in serialization
     * 
     */
    public File() {
    }

    /**
     * 
     * @param hash
     * @param path
     * @param offset
     * @param url
     * @param size
     */
    public File(String url, Integer size, String hash, String path, Integer offset) {
        super();
        this.url = url;
        this.size = size;
        this.hash = hash;
        this.path = path;
        this.offset = offset;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

}
