package example.demo.com;

import org.springframework.expression.ParseException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class ExampleInterfaceImpl implements ExampleInterface {

	public ExampleStudentReturnedDetails getStudentDetails(String inputCode) throws ParseException, JsonParseException {
		// TODO Auto-generated method stub
		try{
			if(StringUtils.isEmpty(inputCode)){
				ExampleStudentReturnedDetails exampleStudentReturnedDetails = new ExampleStudentReturnedDetails();
				ObjectMapper mapperObj = new ObjectMapper();
				String jsonString = mapperObj.writeValueAsString(inputCode);
				HttpEntity<String> entity = new HttpEntity<String>(jsonString);
				RestTemplate rTemplate = new RestTemplate();
				String url = "https://127.0.0.1:8080/rest/service/studentDetails/getStudentDetails/";
				//Store the return object 
				Object o = rTemplate.exchange(url, HttpMethod.POST, entity, null, null);
				//Once the object is returned from the rest service then intially compare the status say HttpStatus.Ok or 200
				//If 200 convert the ApiModel to the WebModel and return the object the front end controller
				if(true){
					//Converted the returned object from rest controller to the object
					return exampleStudentReturnedDetails;
				}
			}
		}catch(Exception e){
			//Print logger statements
			// Depends on the proper required code, this Exception should be divided into more precise exception like NullPointerExcepion, IndexOutOfBound exception etc.
		}
	}

}
