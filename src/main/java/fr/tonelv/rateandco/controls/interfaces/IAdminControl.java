package fr.tonelv.rateandco.controls.interfaces;

import fr.tonelv.rateandco.models.Course;
import fr.tonelv.rateandco.models.Session;
import fr.tonelv.rateandco.models.User;

public interface IAdminControl {

	public Session CreateSession();

	public Session UpdateSession();

	public Boolean DeleteSession();

	public User CreateStudent();

	public User UpdateStudent();

	public User CreateTrainer();

	public User UpdateTrainer();

	public Boolean DeleteStudent();

	public Boolean DeleteTrainer();

	public Course CreateCourse();

	public Course UpdateCourse();

	public Boolean DeleteCourse();

}
