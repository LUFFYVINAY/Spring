package com.example.demo;

public class Employees {
    private int ID;
	public String First_Name;
    public String Last_Name;
    public String email;
    public String phone;
    public  Double salaray;
    
    
   
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Double getSalaray() {
		return salaray;
	}
	public void setSalaray(Double salaray) {
		this.salaray = salaray;
	}
	
	 @Override
		public String toString() {
			return "Employees [ID=" + ID + ", First_Name=" + First_Name + ", Last_Name=" + Last_Name + ", email=" + email
					+ ", phone=" + phone + ", salaray=" + salaray + "]";
		}

}
