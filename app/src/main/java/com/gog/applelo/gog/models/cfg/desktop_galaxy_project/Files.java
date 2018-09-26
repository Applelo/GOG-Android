
package com.gog.applelo.gog.models.cfg.desktop_galaxy_project;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Files {

    @SerializedName("applicationType")
    @Expose
    private String applicationType;
    @SerializedName("baseURI")
    @Expose
    private String baseURI;
    @SerializedName("files")
    @Expose
    private List<File> files = null;
    @SerializedName("projectName")
    @Expose
    private String projectName;
    @SerializedName("symlinks")
    @Expose
    private List<Object> symlinks = null;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    @SerializedName("version")
    @Expose
    private String version;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Files() {
    }

    /**
     * 
     * @param timestamp
     * @param files
     * @param applicationType
     * @param projectName
     * @param baseURI
     * @param symlinks
     * @param version
     */
    public Files(String applicationType, String baseURI, List<File> files, String projectName, List<Object> symlinks, String timestamp, String version) {
        super();
        this.applicationType = applicationType;
        this.baseURI = baseURI;
        this.files = files;
        this.projectName = projectName;
        this.symlinks = symlinks;
        this.timestamp = timestamp;
        this.version = version;
    }

    public String getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    public String getBaseURI() {
        return baseURI;
    }

    public void setBaseURI(String baseURI) {
        this.baseURI = baseURI;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Object> getSymlinks() {
        return symlinks;
    }

    public void setSymlinks(List<Object> symlinks) {
        this.symlinks = symlinks;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

}
