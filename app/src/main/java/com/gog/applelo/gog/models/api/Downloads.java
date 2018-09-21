
package com.gog.applelo.gog.models.api;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Downloads {

    @SerializedName("installers")
    @Expose
    private List<Object> installers = null;
    @SerializedName("patches")
    @Expose
    private List<Object> patches = null;
    @SerializedName("language_packs")
    @Expose
    private List<Object> languagePacks = null;
    @SerializedName("bonus_content")
    @Expose
    private List<BonusContent> bonusContent = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Downloads() {
    }

    /**
     * 
     * @param languagePacks
     * @param patches
     * @param installers
     * @param bonusContent
     */
    public Downloads(List<Object> installers, List<Object> patches, List<Object> languagePacks, List<BonusContent> bonusContent) {
        super();
        this.installers = installers;
        this.patches = patches;
        this.languagePacks = languagePacks;
        this.bonusContent = bonusContent;
    }

    public List<Object> getInstallers() {
        return installers;
    }

    public void setInstallers(List<Object> installers) {
        this.installers = installers;
    }

    public List<Object> getPatches() {
        return patches;
    }

    public void setPatches(List<Object> patches) {
        this.patches = patches;
    }

    public List<Object> getLanguagePacks() {
        return languagePacks;
    }

    public void setLanguagePacks(List<Object> languagePacks) {
        this.languagePacks = languagePacks;
    }

    public List<BonusContent> getBonusContent() {
        return bonusContent;
    }

    public void setBonusContent(List<BonusContent> bonusContent) {
        this.bonusContent = bonusContent;
    }

}
