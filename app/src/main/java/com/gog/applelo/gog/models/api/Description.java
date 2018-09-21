
package com.gog.applelo.gog.models.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Description {

    @SerializedName("lead")
    @Expose
    private String lead;
    @SerializedName("full")
    @Expose
    private String full;
    @SerializedName("whats_cool_about_it")
    @Expose
    private String whatsCoolAboutIt;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Description() {
    }

    /**
     * 
     * @param whatsCoolAboutIt
     * @param full
     * @param lead
     */
    public Description(String lead, String full, String whatsCoolAboutIt) {
        super();
        this.lead = lead;
        this.full = full;
        this.whatsCoolAboutIt = whatsCoolAboutIt;
    }

    public String getLead() {
        return lead;
    }

    public void setLead(String lead) {
        this.lead = lead;
    }

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }

    public String getWhatsCoolAboutIt() {
        return whatsCoolAboutIt;
    }

    public void setWhatsCoolAboutIt(String whatsCoolAboutIt) {
        this.whatsCoolAboutIt = whatsCoolAboutIt;
    }

}
