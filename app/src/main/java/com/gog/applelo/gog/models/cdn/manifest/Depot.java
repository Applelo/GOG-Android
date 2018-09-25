
package com.gog.applelo.gog.models.cdn.manifest;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Depot {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("files")
    @Expose
    private List<File> files = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Depot() {
    }

    /**
     * 
     * @param files
     * @param name
     */
    public Depot(String name, List<File> files) {
        super();
        this.name = name;
        this.files = files;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

}
