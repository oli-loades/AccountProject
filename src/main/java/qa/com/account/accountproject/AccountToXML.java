package qa.com.account.accountproject;

import javax.xml.bind.*;

import java.io.File;

public class AccountToXML {
	
	public static boolean accountToXML(Account acc, String fileName) {
		boolean success = true;
		
		try {
			File file = new File(fileName + ".xml");
			
			JAXBContext jaxbContext = JAXBContext.newInstance(Account.class);
			Marshaller jaxbMarshaller;

			jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(acc, file);
		} catch (JAXBException e) {
			success = false;
			e.printStackTrace();
		}
		return success;
	}
}
