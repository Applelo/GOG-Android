
package com.gog.applelo.gog.models.cdn.repository;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Depot {

    @SerializedName("languages")
    @Expose
    private List<String> languages = null;
    @SerializedName("size")
    @Expose
    private String size;
    @SerializedName("gameIDs")
    @Expose
    private List<String> gameIDs = null;
    @SerializedName("systems")
    @Expose
    private List<String> systems = null;
    @SerializedName("manifest")
    @Expose
    private String manifest;
    @SerializedName("redist")
    @Expose
    private String redist;
    @SerializedName("executable")
    @Expose
    private String executable;
    @SerializedName("argument")
    @Expose
    private String argument;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Depot() {
    }

    /**
     * 
     * @param argument
     * @param systems
     * @param gameIDs
     * @param languages
     * @param executable
     * @param manifest
     * @param redist
     * @param size
     */
    public Depot(List<String> languages, String size, List<String> gameIDs, List<String> systems, String manifest, String redist, String executable, String argument) {
        super();
        this.languages = languages;
        this.size = size;
        this.gameIDs = gameIDs;
        this.systems = systems;
        this.manifest = manifest;
        this.redist = redist;
        this.executable = executable;
        this.argument = argument;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public List<String> getGameIDs() {
        return gameIDs;
    }

    public void setGameIDs(List<String> gameIDs) {
        this.gameIDs = gameIDs;
    }

    public List<String> getSystems() {
        return systems;
    }

    public void setSystems(List<String> systems) {
        this.systems = systems;
    }

    public String getManifest() {
        return manifest;
    }

    public void setManifest(String manifest) {
        this.manifest = manifest;
    }

    public String getRedist() {
        return redist;
    }

    public void setRedist(String redist) {
        this.redist = redist;
    }

    public String getExecutable() {
        return executable;
    }

    public void setExecutable(String executable) {
        this.executable = executable;
    }

    public String getArgument() {
        return argument;
    }

    public void setArgument(String argument) {
        this.argument = argument;
    }

}
