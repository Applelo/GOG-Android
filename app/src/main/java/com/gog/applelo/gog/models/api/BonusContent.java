
package com.gog.applelo.gog.models.api;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BonusContent {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("total_size")
    @Expose
    private Integer totalSize;
    @SerializedName("files")
    @Expose
    private List<File> files = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BonusContent() {
    }

    /**
     * 
     * @param id
     * @param files
     * @param count
     * @param name
     * @param totalSize
     * @param type
     */
    public BonusContent(Integer id, String name, String type, Integer count, Integer totalSize, List<File> files) {
        super();
        this.id = id;
        this.name = name;
        this.type = type;
        this.count = count;
        this.totalSize = totalSize;
        this.files = files;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

}
