
package com.gog.applelo.gog.models.cfg.desktop_galaxy_project;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class File {

    @SerializedName("hash")
    @Expose
    private String hash;
    @SerializedName("path")
    @Expose
    private String path;
    @SerializedName("resource")
    @Expose
    private String resource;
    @SerializedName("size")
    @Expose
    private Integer size;

    /**
     * No args constructor for use in serialization
     * 
     */
    public File() {
    }

    /**
     * 
     * @param hash
     * @param resource
     * @param path
     * @param size
     */
    public File(String hash, String path, String resource, Integer size) {
        super();
        this.hash = hash;
        this.path = path;
        this.resource = resource;
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

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

}
