package cse213.final_project.Jannat;

import java.time.LocalDate;

public class Notification {
    private String notificationId;
    private String recipientId;
    private String message;
    private String type;
    private LocalDate timestamp;
    private boolean isRead;

    public Notification() {
    }

    public Notification(String notificationId, String message, String recipientId, String type, LocalDate timestamp, boolean isRead) {
        this.notificationId = notificationId;
        this.message = message;
        this.recipientId = recipientId;
        this.type = type;
        this.timestamp = timestamp;
        this.isRead = isRead;
    }

    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public String getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "notificationId='" + notificationId + '\'' +
                ", recipientId='" + recipientId + '\'' +
                ", message='" + message + '\'' +
                ", type='" + type + '\'' +
                ", timestamp=" + timestamp +
                ", isRead=" + isRead +
                '}';
    }

    public void send() {
        System.out.println("Sending " + type + " to " + recipientId + ": " + message);
    }

    public void markAsRead() {
        this.isRead = true;
    }
}
