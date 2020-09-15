package com.treeceSpringBoot.api.error;

public class ResourceNotFoundDetails {

	private String title;
	private int status;
	private String detail;
	private long timestamp;
	private String developerMessage;

	private ResourceNotFoundDetails() {
		
	}

	public String getTitle() {
		return title;
	}


	public int getStatus() {
		return status;
	}


	public String getDetail() {
		return detail;
	}


	public long getTimestamp() {
		return timestamp;
	}

	public String getDeveloperMessage() {
		return developerMessage;
	}
		
}