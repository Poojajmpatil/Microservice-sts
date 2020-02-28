package com.cts.demo.model;

import com.cts.demo.Entity.ContactEntity;
public class ContactModel {
	private long contactId;
	private String firstName;
	private String lastName;
	private String mailId;
	private String mobileNumber;
	private String groupCode;
	private String groupTitle;
	private String description;
	private int port;
	
	public ContactModel() {
		super();
	}
	
	public ContactModel(ContactEntity entity,GroupModel group) {
		setContactId(entity.getContactId());
		setFirstName(entity.getFirstName());
		setLastName(entity.getLastName());
		setMailId(entity.getMailId());
		setMobileNumber(entity.getMobileNumber());
		setGroupCode(entity.getGroupCode());
		setGroupTitle(group.getGroupTitle());
		setDescription(group.getDescription());
		setPort(group.getPort());
	}
	public long getContactId() {
		return contactId;
	}
	public void setContactId(long contactId) {
		this.contactId = contactId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getGroupCode() {
		return groupCode;
	}
	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}
	public String getGroupTitle() {
		return groupTitle;
	}
	public void setGroupTitle(String groupTitle) {
		this.groupTitle = groupTitle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public ContactModel(long contactId, String firstName, String lastName, String mailId, String mobileNumber,
			String groupCode, String groupTitle, String description, int port) {
		super();
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mailId = mailId;
		this.mobileNumber = mobileNumber;
		this.groupCode = groupCode;
		this.groupTitle = groupTitle;
		this.description = description;
		this.port = port;
	}
}
	