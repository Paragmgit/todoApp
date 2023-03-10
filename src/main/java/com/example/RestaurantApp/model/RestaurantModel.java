package com.example.RestaurantApp.model;

public class RestaurantModel {
	  private int id;
	  private String restaurantName;
	  private String restaurantAddress;
	  private String restaurantNumber;
	  private String speciality;
	  private int totalStaffs;
	  
	  public RestaurantModel(){}
	  
    public RestaurantModel(int id, String restaurantName, String restaurantAddress, String restaurantNumber,
			String speciality, int totalStaffs) {
		super();
		this.id = id;
		this.restaurantName = restaurantName;
		this.restaurantAddress = restaurantAddress;
		this.restaurantNumber = restaurantNumber;
		this.speciality = speciality;
		this.totalStaffs = totalStaffs;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getRestaurantAddress() {
		return restaurantAddress;
	}
	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}
	public String getRestaurantNumber() {
		return restaurantNumber;
	}
	public void setRestaurantNumber(String restaurantNumber) {
		this.restaurantNumber = restaurantNumber;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public int getTotalStaffs() {
		return totalStaffs;
	}
	public void setTotalStaffs(int totalStaffs) {
		this.totalStaffs = totalStaffs;
	}

	@Override
	public String toString() {
		return "RestaurantModel [id=" + id + ", restaurantName=" + restaurantName + ", restaurantAddress="
				+ restaurantAddress + ", restaurantNumber=" + restaurantNumber + ", speciality=" + speciality
				+ ", totalStaffs=" + totalStaffs + ", getId()=" + getId() + ", getRestaurantName()="
				+ getRestaurantName() + ", getRestaurantAddress()=" + getRestaurantAddress()
				+ ", getRestaurantNumber()=" + getRestaurantNumber() + ", getSpeciality()=" + getSpeciality()
				+ ", getTotalStaffs()=" + getTotalStaffs() + "]";
	}
	
	
	
}
