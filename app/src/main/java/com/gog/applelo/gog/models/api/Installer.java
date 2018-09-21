
package com.gog.applelo.gog.models.api;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Installer {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("os")
    @Expose
    private String os;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("language_full")
    @Expose
    private String languageFull;
    @SerializedName("version")
    @Expose
    private String version;
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
    public Installer() {
    }

    /**
     * 
     * @param id
     * @param files
     * @param os
     * @param languageFull
     * @param name
     * @param language
     * @param totalSize
     * @param version
     */
    public Installer(String id, String name, String os, String language, String languageFull, String version, Integer totalSize, List<File> files) {
        super();
        this.id = id;
        this.name = name;
        this.os = os;
        this.language = language;
        this.languageFull = languageFull;
        this.version = version;
        this.totalSize = totalSize;
        this.files = files;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguageFull() {
        return languageFull;
    }

    public void setLanguageFull(String languageFull) {
        this.languageFull = languageFull;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
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
