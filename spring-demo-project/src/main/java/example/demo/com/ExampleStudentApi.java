package example.demo.com;

import java.util.HashMap;
import java.util.List;

public class ExampleStudentApi {

	private String studentId;
	private String studentLastName;
	private String studentFirstName;
	private List<String> studentClasses;
	private HashMap<Integer,String> studentSessions;
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentLastName() {
		return studentLastName;
	}
	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}
	public String getStudentFirstName() {
		return studentFirstName;
	}
	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}
	public List<String> getStudentClasses() {
		return studentClasses;
	}
	public void setStudentClasses(List<String> studentClasses) {
		this.studentClasses = studentClasses;
	}
	public HashMap<Integer, String> getStudentSessions() {
		return studentSessions;
	}
	public void setStudentSessions(HashMap<Integer, String> studentSessions) {
		this.studentSessions = studentSessions;
	}
}
