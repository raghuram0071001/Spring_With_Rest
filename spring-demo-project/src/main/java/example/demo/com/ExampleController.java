package example.demo.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExampleController {

	@Autowired
	private ExampleStudentApi exampleStudentApi;
	
	@RequestMapping(value="/studentDetails", method = RequestMethod.POST)
	private ModelAndView getStudentDetails(@RequestBody InputCodeBean inputCode){
		
		ModelAndView mav = new ModelAndView();
		return mav;
	}
}
