package com.weibo.dashboard.entity;

public class Traffic {
	private int id;
	private String roadid;
	private String gpsx;
	private String gpsy;
	private String speed;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getRoadid() {
		return roadid;
	}

	public void setRoadid(String roadid) {
		this.roadid = roadid;
	}

	public String getGpsx() {
		return gpsx;
	}

	public void setGpsx(String gpsx) {
		this.gpsx = gpsx;
	}

	public String getGpsy() {
		return gpsy;
	}

	public void setGpsy(String gpsy) {
		this.gpsy = gpsy;
	}
	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}
}
