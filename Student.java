package com.auto.p1;

public class Student {
 final String usn;
 static int seq=1;
 int rc;
 String collegename;
 int yoj;
 String branch;
public Student(int rc, String collegename, int yoj, String branch) {
	super();
	this.rc = rc;
	this.collegename = collegename;
	this.yoj = yoj;
	this.branch = branch;
	this.usn=" "+rc+collegename+yoj+branch+seq++;
}
void display() {
	System.out.println(usn);
}
 
}
