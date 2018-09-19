
package com.gog.applelo.gog.models.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Currency {

    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("symbol")
    @Expose
    private String symbol;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Currency() {
    }

    /**
     * 
     * @param symbol
     * @param code
     */
    public Currency(String code, String symbol) {
        super();
        this.code = code;
        this.symbol = symbol;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

}
