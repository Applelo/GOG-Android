
package com.gog.applelo.gog.models.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Languages {

    @SerializedName("en")
    @Expose
    private String en;
    @SerializedName("fr")
    @Expose
    private String fr;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Languages() {
    }

    /**
     * 
     * @param fr
     * @param en
     */
    public Languages(String en, String fr) {
        super();
        this.en = en;
        this.fr = fr;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

}
