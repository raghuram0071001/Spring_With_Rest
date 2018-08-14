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
	private ResponseEntity<String> getStudentDetails(@RequestBody String reqBody){
		
		
		return null;
	}
}
