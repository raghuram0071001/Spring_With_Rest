package example.demo.com;

import org.springframework.expression.ParseException;

import com.fasterxml.jackson.core.JsonParseException;

public interface ExampleInterface {

	public void getStudentDetails(String inputCode) throws ParseException, JsonParseException;
}
