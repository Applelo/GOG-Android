
package com.gog.applelo.gog.models.user;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserData {

    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("currencies")
    @Expose
    private List<Currency> currencies = null;
    @SerializedName("selectedCurrency")
    @Expose
    private SelectedCurrency selectedCurrency;
    @SerializedName("preferredLanguage")
    @Expose
    private PreferredLanguage preferredLanguage;
    @SerializedName("ratingBrand")
    @Expose
    private String ratingBrand;
    @SerializedName("isLoggedIn")
    @Expose
    private Boolean isLoggedIn;
    @SerializedName("checksum")
    @Expose
    private Checksum checksum;
    @SerializedName("updates")
    @Expose
    private Updates updates;
    @SerializedName("userId")
    @Expose
    private String userId;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("personalizedProductPrices")
    @Expose
    private List<Object> personalizedProductPrices = null;
    @SerializedName("personalizedSeriesPrices")
    @Expose
    private List<Object> personalizedSeriesPrices = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public UserData() {
    }

    /**
     * 
     * @param currencies
     * @param personalizedSeriesPrices
     * @param updates
     * @param isLoggedIn
     * @param checksum
     * @param preferredLanguage
     * @param country
     * @param selectedCurrency
     * @param username
     * @param email
     * @param userId
     * @param personalizedProductPrices
     * @param ratingBrand
     */
    public UserData(String country, List<Currency> currencies, SelectedCurrency selectedCurrency, PreferredLanguage preferredLanguage, String ratingBrand, Boolean isLoggedIn, Checksum checksum, Updates updates, String userId, String username, String email, List<Object> personalizedProductPrices, List<Object> personalizedSeriesPrices) {
        super();
        this.country = country;
        this.currencies = currencies;
        this.selectedCurrency = selectedCurrency;
        this.preferredLanguage = preferredLanguage;
        this.ratingBrand = ratingBrand;
        this.isLoggedIn = isLoggedIn;
        this.checksum = checksum;
        this.updates = updates;
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.personalizedProductPrices = personalizedProductPrices;
        this.personalizedSeriesPrices = personalizedSeriesPrices;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
    }

    public SelectedCurrency getSelectedCurrency() {
        return selectedCurrency;
    }

    public void setSelectedCurrency(SelectedCurrency selectedCurrency) {
        this.selectedCurrency = selectedCurrency;
    }

    public PreferredLanguage getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(PreferredLanguage preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    public String getRatingBrand() {
        return ratingBrand;
    }

    public void setRatingBrand(String ratingBrand) {
        this.ratingBrand = ratingBrand;
    }

    public Boolean getIsLoggedIn() {
        return isLoggedIn;
    }

    public void setIsLoggedIn(Boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }

    public Checksum getChecksum() {
        return checksum;
    }

    public void setChecksum(Checksum checksum) {
        this.checksum = checksum;
    }

    public Updates getUpdates() {
        return updates;
    }

    public void setUpdates(Updates updates) {
        this.updates = updates;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Object> getPersonalizedProductPrices() {
        return personalizedProductPrices;
    }

    public void setPersonalizedProductPrices(List<Object> personalizedProductPrices) {
        this.personalizedProductPrices = personalizedProductPrices;
    }

    public List<Object> getPersonalizedSeriesPrices() {
        return personalizedSeriesPrices;
    }

    public void setPersonalizedSeriesPrices(List<Object> personalizedSeriesPrices) {
        this.personalizedSeriesPrices = personalizedSeriesPrices;
    }

}
