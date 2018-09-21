
package com.gog.applelo.gog.models.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FormattedImage {

    @SerializedName("formatter_name")
    @Expose
    private String formatterName;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FormattedImage() {
    }

    /**
     * 
     * @param formatterName
     * @param imageUrl
     */
    public FormattedImage(String formatterName, String imageUrl) {
        super();
        this.formatterName = formatterName;
        this.imageUrl = imageUrl;
    }

    public String getFormatterName() {
        return formatterName;
    }

    public void setFormatterName(String formatterName) {
        this.formatterName = formatterName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
