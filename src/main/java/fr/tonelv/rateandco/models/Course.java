package fr.tonelv.rateandco.models;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Course implements Serializable {

	@JsonProperty("id")
 private Integer Id;
 @JsonProperty("name")
 private String Name;
 @JsonProperty("description")
 private String Description;
 @JsonProperty("isActive")
 private boolean isActive;
 @JsonCreator
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

	@Override
	public String toString() {
		return "Course{" +
				"Id=" + Id +
				", Name='" + Name + '\'' +
				", Description='" + Description + '\'' +
				", isActive=" + isActive +
				'}';
	}
}
