package fr.tonelv.rateandco.repositories;

import java.util.ArrayList;

import fr.tonelv.rateandco.models.Course;

public interface ICourseRepository {

	Course Create(Course course);
	Course Get(Integer id);
	Course Update(Course course);
	boolean Delete(Integer id);
	ArrayList<Course> GetAll();
}
