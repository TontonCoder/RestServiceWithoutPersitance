package fr.tonelv.rateandco.models;

import java.util.ArrayList;
import java.util.Date;

public class Session {
	
    private Integer Id;

    private Date starting;

    private Date ending;

    private Course course;

    private ArrayList<User> students;

    private ArrayList<RateSession> ratesSession;

    private ArrayList<RateStudent> ratesStudents;

    private User trainer;

	public Session(Integer id, Date starting, Date ending, Course course, ArrayList<User> students,
			ArrayList<RateSession> ratesSession, ArrayList<RateStudent> ratesStudents, User trainer) {
		super();
		Id = id;
		this.starting = starting;
		this.ending = ending;
		this.course = course;
		this.students = students;
		this.ratesSession = ratesSession;
		this.ratesStudents = ratesStudents;
		this.trainer = trainer;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Date getStarting() {
		return starting;
	}

	public void setStarting(Date starting) {
		this.starting = starting;
	}

	public Date getEnding() {
		return ending;
	}

	public void setEnding(Date ending) {
		this.ending = ending;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public ArrayList<User> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<User> students) {
		this.students = students;
	}

	public ArrayList<RateSession> getRatesSession() {
		return ratesSession;
	}

	public void setRatesSession(ArrayList<RateSession> ratesSession) {
		this.ratesSession = ratesSession;
	}

	public ArrayList<RateStudent> getRatesStudents() {
		return ratesStudents;
	}

	public void setRatesStudents(ArrayList<RateStudent> ratesStudents) {
		this.ratesStudents = ratesStudents;
	}

	public User getTrainer() {
		return trainer;
	}

	public void setTrainer(User trainer) {
		this.trainer = trainer;
	}
	
	
	
    
    
}
