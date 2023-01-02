//this is student.java package of entity

package com.joshua.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")

public class Student {
	
@Id @Column
private int sno;
@Column
private String sname;
@Column
private String Course;

public Student() {
super();
}
public Student(int sno, String sname, String course) {
	
super();
this.sno = sno;
this.sname = sname;
this.Course = course; 
}

public int getSno() {
return sno; }
public void setSno(int sno) {
this.sno = sno; }
public String getSname() {
return sname; }
public void setSname(String sname) {
this.sname = sname; }
public String getCourse() {
return Course; }
public void setCourse(String course) {
this.Course = course;
 }
}