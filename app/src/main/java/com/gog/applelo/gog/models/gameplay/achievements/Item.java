
package com.gog.applelo.gog.models.gameplay.achievements;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("achievement_id")
    @Expose
    private String achievementId;
    @SerializedName("achievement_key")
    @Expose
    private String achievementKey;
    @SerializedName("visible")
    @Expose
    private Boolean visible;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("image_url_unlocked")
    @Expose
    private String imageUrlUnlocked;
    @SerializedName("image_url_locked")
    @Expose
    private String imageUrlLocked;
    @SerializedName("rarity")
    @Expose
    private Double rarity;
    @SerializedName("date_unlocked")
    @Expose
    private Object dateUnlocked;
    @SerializedName("rarity_level_description")
    @Expose
    private String rarityLevelDescription;
    @SerializedName("rarity_level_slug")
    @Expose
    private String rarityLevelSlug;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Item() {
    }

    /**
     * 
     * @param imageUrlLocked
     * @param visible
     * @param dateUnlocked
     * @param description
     * @param name
     * @param achievementKey
     * @param rarity
     * @param achievementId
     * @param imageUrlUnlocked
     * @param rarityLevelSlug
     * @param rarityLevelDescription
     */
    public Item(String achievementId, String achievementKey, Boolean visible, String name, String description, String imageUrlUnlocked, String imageUrlLocked, Double rarity, Object dateUnlocked, String rarityLevelDescription, String rarityLevelSlug) {
        super();
        this.achievementId = achievementId;
        this.achievementKey = achievementKey;
        this.visible = visible;
        this.name = name;
        this.description = description;
        this.imageUrlUnlocked = imageUrlUnlocked;
        this.imageUrlLocked = imageUrlLocked;
        this.rarity = rarity;
        this.dateUnlocked = dateUnlocked;
        this.rarityLevelDescription = rarityLevelDescription;
        this.rarityLevelSlug = rarityLevelSlug;
    }

    public String getAchievementId() {
        return achievementId;
    }

    public void setAchievementId(String achievementId) {
        this.achievementId = achievementId;
    }

    public String getAchievementKey() {
        return achievementKey;
    }

    public void setAchievementKey(String achievementKey) {
        this.achievementKey = achievementKey;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrlUnlocked() {
        return imageUrlUnlocked;
    }

    public void setImageUrlUnlocked(String imageUrlUnlocked) {
        this.imageUrlUnlocked = imageUrlUnlocked;
    }

    public String getImageUrlLocked() {
        return imageUrlLocked;
    }

    public void setImageUrlLocked(String imageUrlLocked) {
        this.imageUrlLocked = imageUrlLocked;
    }

    public Double getRarity() {
        return rarity;
    }

    public void setRarity(Double rarity) {
        this.rarity = rarity;
    }

    public Object getDateUnlocked() {
        return dateUnlocked;
    }

    public void setDateUnlocked(Object dateUnlocked) {
        this.dateUnlocked = dateUnlocked;
    }

    public String getRarityLevelDescription() {
        return rarityLevelDescription;
    }

    public void setRarityLevelDescription(String rarityLevelDescription) {
        this.rarityLevelDescription = rarityLevelDescription;
    }

    public String getRarityLevelSlug() {
        return rarityLevelSlug;
    }

    public void setRarityLevelSlug(String rarityLevelSlug) {
        this.rarityLevelSlug = rarityLevelSlug;
    }

}
