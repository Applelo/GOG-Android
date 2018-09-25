
package com.gog.applelo.gog.models.cdn.repository;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GameID {

    @SerializedName("dependencies")
    @Expose
    private List<Object> dependencies = null;
    @SerializedName("gameID")
    @Expose
    private String gameID;
    @SerializedName("name")
    @Expose
    private Name name;
    @SerializedName("standalone")
    @Expose
    private Boolean standalone;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GameID() {
    }

    /**
     * 
     * @param gameID
     * @param dependencies
     * @param name
     * @param standalone
     */
    public GameID(List<Object> dependencies, String gameID, Name name, Boolean standalone) {
        super();
        this.dependencies = dependencies;
        this.gameID = gameID;
        this.name = name;
        this.standalone = standalone;
    }

    public List<Object> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<Object> dependencies) {
        this.dependencies = dependencies;
    }

    public String getGameID() {
        return gameID;
    }

    public void setGameID(String gameID) {
        this.gameID = gameID;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Boolean getStandalone() {
        return standalone;
    }

    public void setStandalone(Boolean standalone) {
        this.standalone = standalone;
    }

}
