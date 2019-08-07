package fr.tonelv.rateandco.models;

import java.util.Date;

public class RateSession {

    private Integer Id;

    private Integer c1;
    private Integer c2;
    private Integer c3;
    private Integer c4;
    private Integer c5;
    private Integer c6;
    private Integer cm1;
    private Integer cm2;
    private Integer cmc3;
    private Integer cmc4;
    private Integer f1;
    private Integer f2;
    private Integer f3;
    private Integer f4;
    private Integer f5;
    private Integer cmf;

    private User student;

    private Date date;

    private Integer sessionId;

	public RateSession(Integer id, Integer c1, Integer c2, Integer c3, Integer c4, Integer c5, Integer c6, Integer cm1,
			Integer cm2, Integer cmc3, Integer cmc4, Integer f1, Integer f2, Integer f3, Integer f4, Integer f5,
			Integer cmf, User student, Date date, Integer sessionId) {
		super();
		Id = id;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.c4 = c4;
		this.c5 = c5;
		this.c6 = c6;
		this.cm1 = cm1;
		this.cm2 = cm2;
		this.cmc3 = cmc3;
		this.cmc4 = cmc4;
		this.f1 = f1;
		this.f2 = f2;
		this.f3 = f3;
		this.f4 = f4;
		this.f5 = f5;
		this.cmf = cmf;
		this.student = student;
		this.date = date;
		this.sessionId = sessionId;
	}

	public RateSession(Integer c1, Integer c2, Integer c3, Integer c4, Integer c5, Integer c6, Integer cm1, Integer cm2,
			Integer cmc3, Integer cmc4, Integer f1, Integer f2, Integer f3, Integer f4, Integer f5, Integer cmf,
			User student, Date date, Integer sessionId) {
		super();
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.c4 = c4;
		this.c5 = c5;
		this.c6 = c6;
		this.cm1 = cm1;
		this.cm2 = cm2;
		this.cmc3 = cmc3;
		this.cmc4 = cmc4;
		this.f1 = f1;
		this.f2 = f2;
		this.f3 = f3;
		this.f4 = f4;
		this.f5 = f5;
		this.cmf = cmf;
		this.student = student;
		this.date = date;
		this.sessionId = sessionId;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getC1() {
		return c1;
	}

	public void setC1(Integer c1) {
		this.c1 = c1;
	}

	public Integer getC2() {
		return c2;
	}

	public void setC2(Integer c2) {
		this.c2 = c2;
	}

	public Integer getC3() {
		return c3;
	}

	public void setC3(Integer c3) {
		this.c3 = c3;
	}

	public Integer getC4() {
		return c4;
	}

	public void setC4(Integer c4) {
		this.c4 = c4;
	}

	public Integer getC5() {
		return c5;
	}

	public void setC5(Integer c5) {
		this.c5 = c5;
	}

	public Integer getC6() {
		return c6;
	}

	public void setC6(Integer c6) {
		this.c6 = c6;
	}

	public Integer getCm1() {
		return cm1;
	}

	public void setCm1(Integer cm1) {
		this.cm1 = cm1;
	}

	public Integer getCm2() {
		return cm2;
	}

	public void setCm2(Integer cm2) {
		this.cm2 = cm2;
	}

	public Integer getCmc3() {
		return cmc3;
	}

	public void setCmc3(Integer cmc3) {
		this.cmc3 = cmc3;
	}

	public Integer getCmc4() {
		return cmc4;
	}

	public void setCmc4(Integer cmc4) {
		this.cmc4 = cmc4;
	}

	public Integer getF1() {
		return f1;
	}

	public void setF1(Integer f1) {
		this.f1 = f1;
	}

	public Integer getF2() {
		return f2;
	}

	public void setF2(Integer f2) {
		this.f2 = f2;
	}

	public Integer getF3() {
		return f3;
	}

	public void setF3(Integer f3) {
		this.f3 = f3;
	}

	public Integer getF4() {
		return f4;
	}

	public void setF4(Integer f4) {
		this.f4 = f4;
	}

	public Integer getF5() {
		return f5;
	}

	public void setF5(Integer f5) {
		this.f5 = f5;
	}

	public Integer getCmf() {
		return cmf;
	}

	public void setCmf(Integer cmf) {
		this.cmf = cmf;
	}

	public User getStudent() {
		return student;
	}

	public void setStudent(User student) {
		this.student = student;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getSessionId() {
		return sessionId;
	}

	public void setSessionId(Integer sessionId) {
		this.sessionId = sessionId;
	}
    
    

    
    
}
