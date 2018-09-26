
package com.gog.applelo.gog.models.embed.listing.products;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Price {

    @SerializedName("amount")
    @Expose
    private String amount;
    @SerializedName("baseAmount")
    @Expose
    private String baseAmount;
    @SerializedName("finalAmount")
    @Expose
    private String finalAmount;
    @SerializedName("isDiscounted")
    @Expose
    private Boolean isDiscounted;
    @SerializedName("discountPercentage")
    @Expose
    private Integer discountPercentage;
    @SerializedName("discountDifference")
    @Expose
    private String discountDifference;
    @SerializedName("symbol")
    @Expose
    private String symbol;
    @SerializedName("isFree")
    @Expose
    private Boolean isFree;
    @SerializedName("discount")
    @Expose
    private Integer discount;
    @SerializedName("isBonusStoreCreditIncluded")
    @Expose
    private Boolean isBonusStoreCreditIncluded;
    @SerializedName("bonusStoreCreditAmount")
    @Expose
    private String bonusStoreCreditAmount;
    @SerializedName("promoId")
    @Expose
    private Object promoId;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Price() {
    }

    /**
     * 
     * @param bonusStoreCreditAmount
     * @param finalAmount
     * @param amount
     * @param promoId
     * @param baseAmount
     * @param symbol
     * @param isFree
     * @param discountPercentage
     * @param isBonusStoreCreditIncluded
     * @param discountDifference
     * @param isDiscounted
     * @param discount
     */
    public Price(String amount, String baseAmount, String finalAmount, Boolean isDiscounted, Integer discountPercentage, String discountDifference, String symbol, Boolean isFree, Integer discount, Boolean isBonusStoreCreditIncluded, String bonusStoreCreditAmount, Object promoId) {
        super();
        this.amount = amount;
        this.baseAmount = baseAmount;
        this.finalAmount = finalAmount;
        this.isDiscounted = isDiscounted;
        this.discountPercentage = discountPercentage;
        this.discountDifference = discountDifference;
        this.symbol = symbol;
        this.isFree = isFree;
        this.discount = discount;
        this.isBonusStoreCreditIncluded = isBonusStoreCreditIncluded;
        this.bonusStoreCreditAmount = bonusStoreCreditAmount;
        this.promoId = promoId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(String baseAmount) {
        this.baseAmount = baseAmount;
    }

    public String getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(String finalAmount) {
        this.finalAmount = finalAmount;
    }

    public Boolean getIsDiscounted() {
        return isDiscounted;
    }

    public void setIsDiscounted(Boolean isDiscounted) {
        this.isDiscounted = isDiscounted;
    }

    public Integer getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(Integer discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public String getDiscountDifference() {
        return discountDifference;
    }

    public void setDiscountDifference(String discountDifference) {
        this.discountDifference = discountDifference;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Boolean getIsFree() {
        return isFree;
    }

    public void setIsFree(Boolean isFree) {
        this.isFree = isFree;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Boolean getIsBonusStoreCreditIncluded() {
        return isBonusStoreCreditIncluded;
    }

    public void setIsBonusStoreCreditIncluded(Boolean isBonusStoreCreditIncluded) {
        this.isBonusStoreCreditIncluded = isBonusStoreCreditIncluded;
    }

    public String getBonusStoreCreditAmount() {
        return bonusStoreCreditAmount;
    }

    public void setBonusStoreCreditAmount(String bonusStoreCreditAmount) {
        this.bonusStoreCreditAmount = bonusStoreCreditAmount;
    }

    public Object getPromoId() {
        return promoId;
    }

    public void setPromoId(Object promoId) {
        this.promoId = promoId;
    }

}
