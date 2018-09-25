
package com.gog.applelo.gog.models.cdn.repository;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product {

    @SerializedName("timestamp")
    @Expose
    private Integer timestamp;
    @SerializedName("depots")
    @Expose
    private List<Depot> depots = null;
    @SerializedName("support_commands")
    @Expose
    private List<SupportCommand> supportCommands = null;
    @SerializedName("installDirectory")
    @Expose
    private String installDirectory;
    @SerializedName("rootGameID")
    @Expose
    private String rootGameID;
    @SerializedName("gameIDs")
    @Expose
    private List<GameID> gameIDs = null;
    @SerializedName("projectName")
    @Expose
    private String projectName;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Product() {
    }

    /**
     * 
     * @param timestamp
     * @param gameIDs
     * @param rootGameID
     * @param supportCommands
     * @param projectName
     * @param installDirectory
     * @param depots
     */
    public Product(Integer timestamp, List<Depot> depots, List<SupportCommand> supportCommands, String installDirectory, String rootGameID, List<GameID> gameIDs, String projectName) {
        super();
        this.timestamp = timestamp;
        this.depots = depots;
        this.supportCommands = supportCommands;
        this.installDirectory = installDirectory;
        this.rootGameID = rootGameID;
        this.gameIDs = gameIDs;
        this.projectName = projectName;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public List<Depot> getDepots() {
        return depots;
    }

    public void setDepots(List<Depot> depots) {
        this.depots = depots;
    }

    public List<SupportCommand> getSupportCommands() {
        return supportCommands;
    }

    public void setSupportCommands(List<SupportCommand> supportCommands) {
        this.supportCommands = supportCommands;
    }

    public String getInstallDirectory() {
        return installDirectory;
    }

    public void setInstallDirectory(String installDirectory) {
        this.installDirectory = installDirectory;
    }

    public String getRootGameID() {
        return rootGameID;
    }

    public void setRootGameID(String rootGameID) {
        this.rootGameID = rootGameID;
    }

    public List<GameID> getGameIDs() {
        return gameIDs;
    }

    public void setGameIDs(List<GameID> gameIDs) {
        this.gameIDs = gameIDs;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

}
