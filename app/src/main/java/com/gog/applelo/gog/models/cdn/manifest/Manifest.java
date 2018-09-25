
package com.gog.applelo.gog.models.cdn.manifest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Manifest {

    @SerializedName("version")
    @Expose
    private Integer version;
    @SerializedName("depot")
    @Expose
    private Depot depot;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Manifest() {
    }

    /**
     * 
     * @param depot
     * @param version
     */
    public Manifest(Integer version, Depot depot) {
        super();
        this.version = version;
        this.depot = depot;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Depot getDepot() {
        return depot;
    }

    public void setDepot(Depot depot) {
        this.depot = depot;
    }

}
