
package com.gog.applelo.gog.models.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Updates {

    @SerializedName("messages")
    @Expose
    private Integer messages;
    @SerializedName("pendingFriendRequests")
    @Expose
    private Integer pendingFriendRequests;
    @SerializedName("unreadChatMessages")
    @Expose
    private Integer unreadChatMessages;
    @SerializedName("products")
    @Expose
    private Integer products;
    @SerializedName("total")
    @Expose
    private Integer total;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Updates() {
    }

    /**
     * 
     * @param total
     * @param products
     * @param unreadChatMessages
     * @param pendingFriendRequests
     * @param messages
     */
    public Updates(Integer messages, Integer pendingFriendRequests, Integer unreadChatMessages, Integer products, Integer total) {
        super();
        this.messages = messages;
        this.pendingFriendRequests = pendingFriendRequests;
        this.unreadChatMessages = unreadChatMessages;
        this.products = products;
        this.total = total;
    }

    public Integer getMessages() {
        return messages;
    }

    public void setMessages(Integer messages) {
        this.messages = messages;
    }

    public Integer getPendingFriendRequests() {
        return pendingFriendRequests;
    }

    public void setPendingFriendRequests(Integer pendingFriendRequests) {
        this.pendingFriendRequests = pendingFriendRequests;
    }

    public Integer getUnreadChatMessages() {
        return unreadChatMessages;
    }

    public void setUnreadChatMessages(Integer unreadChatMessages) {
        this.unreadChatMessages = unreadChatMessages;
    }

    public Integer getProducts() {
        return products;
    }

    public void setProducts(Integer products) {
        this.products = products;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

}
