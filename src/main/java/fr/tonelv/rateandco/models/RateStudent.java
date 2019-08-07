package fr.tonelv.rateandco.models;

public class RateStudent {
    private Integer Id;

    private Integer rating;

    private String comments;

    private Integer sessionId;

    private Integer studentId;

    private User student;

	public RateStudent(Integer id, Integer rating, String comments, Integer sessionId, Integer studentId,
			User student) {
		super();
		Id = id;
		this.rating = rating;
		this.comments = comments;
		this.sessionId = sessionId;
		this.studentId = studentId;
		this.student = student;
	}

	public RateStudent(Integer rating, String comments, Integer sessionId, Integer studentId, User student) {
		super();
		this.rating = rating;
		this.comments = comments;
		this.sessionId = sessionId;
		this.studentId = studentId;
		this.student = student;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Integer getSessionId() {
		return sessionId;
	}

	public void setSessionId(Integer sessionId) {
		this.sessionId = sessionId;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public User getStudent() {
		return student;
	}

	public void setStudent(User student) {
		this.student = student;
	}
    
	
    
}
