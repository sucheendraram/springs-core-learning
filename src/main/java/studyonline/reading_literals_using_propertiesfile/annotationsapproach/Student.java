package studyonline.reading_literals_using_propertiesfile.annotationsapproach;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("${student.name}")
	String name;
	
	@Value("${student.regNo}")
	String regNo;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	
	public void display() {
		System.out.println("The name is "+name);
		System.out.println("The registration number is "+regNo);
	}
	
	
}
