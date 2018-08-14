package example.demo.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonParseException;

@Controller
public class ExampleController {

	@Autowired
	private ExampleInterfaceImpl exampleInterfaceImpl;
	
	@RequestMapping(value="/studentDetails", method = RequestMethod.POST)
	private ModelAndView getStudentDetails(@RequestBody InputCodeBean inputCodeBean) throws ParseException, JsonParseException{
		ExampleStudentReturnedDetails stuDetails = exampleInterfaceImpl.getStudentDetails(inputCodeBean.getInputCode());
		ModelAndView mav = new ModelAndView("example/demo/com/StudentDetails");
		mav.addObject("returnedObj",stuDetails);
		return mav;
	}
}
