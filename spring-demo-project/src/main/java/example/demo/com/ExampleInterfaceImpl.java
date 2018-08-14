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

	public void getStudentDetails(String inputCode) throws ParseException, JsonParseException {
		// TODO Auto-generated method stub
		try{
			if(StringUtils.isEmpty(inputCode)){
				
				ObjectMapper mapperObj = new ObjectMapper();
				String jsonString = mapperObj.writeValueAsString(inputCode);
				HttpEntity<String> entity = new HttpEntity<String>(jsonString);
				RestTemplate rTemplate = new RestTemplate();
				String url = "https://127.0.0.1:8080/rest/service/studentDetails/getStudentDetails/";
				rTemplate.exchange(url, HttpMethod.POST, entity, null, null);
			}
		}catch(Exception e){
			
		}
	}

}
