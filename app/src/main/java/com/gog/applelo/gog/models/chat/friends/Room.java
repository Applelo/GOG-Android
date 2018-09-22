
package com.gog.applelo.gog.models.chat.friends;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Room {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("participants")
    @Expose
    private List<String> participants = null;
    @SerializedName("second_participant")
    @Expose
    private String secondParticipant;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("last_active")
    @Expose
    private String lastActive;
    @SerializedName("unread_messages_count")
    @Expose
    private Integer unreadMessagesCount;
    @SerializedName("is_employee")
    @Expose
    private Boolean isEmployee;
    @SerializedName("participant_banned")
    @Expose
    private Boolean participantBanned;
    @SerializedName("state")
    @Expose
    private String state;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Room() {
    }

    /**
     * 
     * @param id
     * @param secondParticipant
     * @param lastActive
     * @param name
     * @param state
     * @param participantBanned
     * @param unreadMessagesCount
     * @param isEmployee
     * @param participants
     */
    public Room(String id, List<String> participants, String secondParticipant, String name, String lastActive, Integer unreadMessagesCount, Boolean isEmployee, Boolean participantBanned, String state) {
        super();
        this.id = id;
        this.participants = participants;
        this.secondParticipant = secondParticipant;
        this.name = name;
        this.lastActive = lastActive;
        this.unreadMessagesCount = unreadMessagesCount;
        this.isEmployee = isEmployee;
        this.participantBanned = participantBanned;
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getParticipants() {
        return participants;
    }

    public void setParticipants(List<String> participants) {
        this.participants = participants;
    }

    public String getSecondParticipant() {
        return secondParticipant;
    }

    public void setSecondParticipant(String secondParticipant) {
        this.secondParticipant = secondParticipant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastActive() {
        return lastActive;
    }

    public void setLastActive(String lastActive) {
        this.lastActive = lastActive;
    }

    public Integer getUnreadMessagesCount() {
        return unreadMessagesCount;
    }

    public void setUnreadMessagesCount(Integer unreadMessagesCount) {
        this.unreadMessagesCount = unreadMessagesCount;
    }

    public Boolean getIsEmployee() {
        return isEmployee;
    }

    public void setIsEmployee(Boolean isEmployee) {
        this.isEmployee = isEmployee;
    }

    public Boolean getParticipantBanned() {
        return participantBanned;
    }

    public void setParticipantBanned(Boolean participantBanned) {
        this.participantBanned = participantBanned;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
