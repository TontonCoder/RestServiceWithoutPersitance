package fr.tonelv.rateandco.models;


public class Course {
 private Integer Id;
 private String Name;
 private String Description;
 private boolean isActive;
public Course(Integer id, String name, String description, boolean isActive) {
	super();
	Id = id;
	Name = name;
	Description = description;
	this.isActive = isActive;
}
public Course(String name, String description, boolean isActive) {
	super();
	Name = name;
	Description = description;
	this.isActive = isActive;
}
public Integer getId() {
	return Id;
}
public void setId(Integer id) {
	Id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}
public boolean isActive() {
	return isActive;
}
public void setActive(boolean isActive) {
	this.isActive = isActive;
}
 
 
}
