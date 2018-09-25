
package com.gog.applelo.gog.models.cdn.repository;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SupportCommand {

    @SerializedName("languages")
    @Expose
    private List<String> languages = null;
    @SerializedName("executable")
    @Expose
    private String executable;
    @SerializedName("gameID")
    @Expose
    private String gameID;
    @SerializedName("systems")
    @Expose
    private List<String> systems = null;
    @SerializedName("argument")
    @Expose
    private String argument;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SupportCommand() {
    }

    /**
     * 
     * @param argument
     * @param systems
     * @param languages
     * @param gameID
     * @param executable
     */
    public SupportCommand(List<String> languages, String executable, String gameID, List<String> systems, String argument) {
        super();
        this.languages = languages;
        this.executable = executable;
        this.gameID = gameID;
        this.systems = systems;
        this.argument = argument;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public String getExecutable() {
        return executable;
    }

    public void setExecutable(String executable) {
        this.executable = executable;
    }

    public String getGameID() {
        return gameID;
    }

    public void setGameID(String gameID) {
        this.gameID = gameID;
    }

    public List<String> getSystems() {
        return systems;
    }

    public void setSystems(List<String> systems) {
        this.systems = systems;
    }

    public String getArgument() {
        return argument;
    }

    public void setArgument(String argument) {
        this.argument = argument;
    }

}
