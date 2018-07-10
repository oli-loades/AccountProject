package qa.com.account.accountproject;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONToAccountConverter {

	public static Account JSONToAccount(String jsonString)
			throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(jsonString, Account.class);
	}

}
