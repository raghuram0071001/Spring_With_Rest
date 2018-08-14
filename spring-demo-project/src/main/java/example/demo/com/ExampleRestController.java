package example.demo.com;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/service/")
public class ExampleRestController {

	@RequestMapping("studentDetails/getStudentDetails/")
	@Consumes("Application/JSON")
	@Produces("Application/JSON")
	private String getStudentDetails(@RequestBody String reqBody){
	//This 	method consumes json and produces json
		//Convert the json object to Java Object using Jackson json parser
		//Do the security check that the call made to this rest service is genuine and trust worthy and once passed send the converted object to service layer to process
		return "ResponseString" ; //The response string is jsonstring of the complete object from service impl which includes the data from Database and status of the call
	}
}
