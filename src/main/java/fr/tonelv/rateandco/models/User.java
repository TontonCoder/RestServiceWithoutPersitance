package fr.tonelv.rateandco.models;

public class User {
	
private Integer Id;
private String firstName;
private String lastName;
private String username;
private String hash;
private boolean isActive;
private String role;

public User(String firstName, String lastName, String username, String hash, boolean isActive, String role) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.username = username;
	this.hash = hash;
	this.isActive = isActive;
	this.role = role;
}
public User(Integer id, String firstName, String lastName, String username, String hash, boolean isActive,
		String role) {
	super();
	Id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.username = username;
	this.hash = hash;
	this.isActive = isActive;
	this.role = role;
}
public Integer getId() {
	return Id;
}
public void setId(Integer id) {
	Id = id;
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
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getHash() {
	return hash;
}
public void setHash(String hash) {
	this.hash = hash;
}
public boolean isActive() {
	return isActive;
}
public void setActive(boolean isActive) {
	this.isActive = isActive;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}


}
