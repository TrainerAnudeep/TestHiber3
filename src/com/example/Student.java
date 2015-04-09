package com.example;

/**
 * Student entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private Long sid;
	private String sname;
	private Long sage;
	private String fname;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(Long sid) {
		this.sid = sid;
	}

	/** full constructor */
	public Student(Long sid, String sname, Long sage, String fname) {
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.fname = fname;
	}

	// Property accessors

	public Long getSid() {
		return this.sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Long getSage() {
		return this.sage;
	}

	public void setSage(Long sage) {
		this.sage = sage;
	}

	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

}