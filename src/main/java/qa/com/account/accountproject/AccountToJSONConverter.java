package qa.com.account.accountproject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AccountToJSONConverter {

	public static String convert(Account acc) {
		String jsonString = "";
		try{
			ObjectMapper mapper = new ObjectMapper();
			jsonString = mapper.writeValueAsString(acc);
		}catch(JsonProcessingException jpe){
			jpe.printStackTrace();
		}
		
		return jsonString;
	}

}
