
package com.gog.applelo.gog.models.api;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Screenshot {

    @SerializedName("image_id")
    @Expose
    private String imageId;
    @SerializedName("formatter_template_url")
    @Expose
    private String formatterTemplateUrl;
    @SerializedName("formatted_images")
    @Expose
    private List<FormattedImage> formattedImages = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Screenshot() {
    }

    /**
     * 
     * @param imageId
     * @param formatterTemplateUrl
     * @param formattedImages
     */
    public Screenshot(String imageId, String formatterTemplateUrl, List<FormattedImage> formattedImages) {
        super();
        this.imageId = imageId;
        this.formatterTemplateUrl = formatterTemplateUrl;
        this.formattedImages = formattedImages;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getFormatterTemplateUrl() {
        return formatterTemplateUrl;
    }

    public void setFormatterTemplateUrl(String formatterTemplateUrl) {
        this.formatterTemplateUrl = formatterTemplateUrl;
    }

    public List<FormattedImage> getFormattedImages() {
        return formattedImages;
    }

    public void setFormattedImages(List<FormattedImage> formattedImages) {
        this.formattedImages = formattedImages;
    }

}
