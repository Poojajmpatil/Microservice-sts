package com.cts.demo.model;


public class GroupModel {
	private String groupCode;
	private String groupTitle;
	private String description;
	private int port;
	
	
	public GroupModel(String groupCode, String groupTitle, String description, int port) {
		super();
		this.groupCode = groupCode;
		this.groupTitle = groupTitle;
		this.description = description;
		this.port = port;
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
	public GroupModel() {
		super();
	}
	

}