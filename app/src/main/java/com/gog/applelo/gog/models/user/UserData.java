
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
    @SerializedName("galaxyUserId")
    @Expose
    private String galaxyUserId;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("avatar")
    @Expose
    private String avatar;
    @SerializedName("walletBalance")
    @Expose
    private WalletBalance walletBalance;
    @SerializedName("purchasedItems")
    @Expose
    private PurchasedItems purchasedItems;
    @SerializedName("wishlistedItems")
    @Expose
    private Integer wishlistedItems;
    @SerializedName("friends")
    @Expose
    private List<Friend> friends = null;
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
     * @param wishlistedItems
     * @param isLoggedIn
     * @param checksum
     * @param avatar
     * @param preferredLanguage
     * @param country
     * @param selectedCurrency
     * @param username
     * @param galaxyUserId
     * @param friends
     * @param walletBalance
     * @param email
     * @param userId
     * @param personalizedProductPrices
     * @param purchasedItems
     * @param ratingBrand
     */
    public UserData(String country, List<Currency> currencies, SelectedCurrency selectedCurrency, PreferredLanguage preferredLanguage, String ratingBrand, Boolean isLoggedIn, Checksum checksum, Updates updates, String userId, String username, String galaxyUserId, String email, String avatar, WalletBalance walletBalance, PurchasedItems purchasedItems, Integer wishlistedItems, List<Friend> friends, List<Object> personalizedProductPrices, List<Object> personalizedSeriesPrices) {
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
        this.galaxyUserId = galaxyUserId;
        this.email = email;
        this.avatar = avatar;
        this.walletBalance = walletBalance;
        this.purchasedItems = purchasedItems;
        this.wishlistedItems = wishlistedItems;
        this.friends = friends;
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

    public String getGalaxyUserId() {
        return galaxyUserId;
    }

    public void setGalaxyUserId(String galaxyUserId) {
        this.galaxyUserId = galaxyUserId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public WalletBalance getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(WalletBalance walletBalance) {
        this.walletBalance = walletBalance;
    }

    public PurchasedItems getPurchasedItems() {
        return purchasedItems;
    }

    public void setPurchasedItems(PurchasedItems purchasedItems) {
        this.purchasedItems = purchasedItems;
    }

    public Integer getWishlistedItems() {
        return wishlistedItems;
    }

    public void setWishlistedItems(Integer wishlistedItems) {
        this.wishlistedItems = wishlistedItems;
    }

    public List<Friend> getFriends() {
        return friends;
    }

    public void setFriends(List<Friend> friends) {
        this.friends = friends;
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
