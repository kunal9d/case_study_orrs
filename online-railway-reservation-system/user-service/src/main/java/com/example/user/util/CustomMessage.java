package com.example.user.util;

import java.util.Date;

public class CustomMessage {

    private String messageId;
    private String message;
    private Date messageDate;
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getMessageDate() {
		return messageDate;
	}
	public void setMessageDate(Date messageDate) {
		this.messageDate = messageDate;
	}
	@Override
	public String toString() {
		return "New Notification [messageId=" + messageId + ", message=" + message + ", messageDate=" + messageDate + "]";
	}
	
}
