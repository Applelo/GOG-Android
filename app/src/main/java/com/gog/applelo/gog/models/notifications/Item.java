
package com.gog.applelo.gog.models.notifications;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("consumed")
    @Expose
    private Boolean consumed;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("payload")
    @Expose
    private String payload;
    @SerializedName("date_created")
    @Expose
    private String dateCreated;
    @SerializedName("date_updated")
    @Expose
    private String dateUpdated;
    @SerializedName("date_expiration")
    @Expose
    private String dateExpiration;
    @SerializedName("unique_key")
    @Expose
    private String uniqueKey;
    @SerializedName("counter")
    @Expose
    private Integer counter;
    @SerializedName("date_consumed")
    @Expose
    private Object dateConsumed;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Item() {
    }

    /**
     * 
     * @param id
     * @param dateConsumed
     * @param consumed
     * @param counter
     * @param dateExpiration
     * @param dateCreated
     * @param payload
     * @param type
     * @param uniqueKey
     * @param dateUpdated
     */
    public Item(String id, Boolean consumed, String type, String payload, String dateCreated, String dateUpdated, String dateExpiration, String uniqueKey, Integer counter, Object dateConsumed) {
        super();
        this.id = id;
        this.consumed = consumed;
        this.type = type;
        this.payload = payload;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.dateExpiration = dateExpiration;
        this.uniqueKey = uniqueKey;
        this.counter = counter;
        this.dateConsumed = dateConsumed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getConsumed() {
        return consumed;
    }

    public void setConsumed(Boolean consumed) {
        this.consumed = consumed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public String getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(String dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public String getUniqueKey() {
        return uniqueKey;
    }

    public void setUniqueKey(String uniqueKey) {
        this.uniqueKey = uniqueKey;
    }

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }

    public Object getDateConsumed() {
        return dateConsumed;
    }

    public void setDateConsumed(Object dateConsumed) {
        this.dateConsumed = dateConsumed;
    }

}
