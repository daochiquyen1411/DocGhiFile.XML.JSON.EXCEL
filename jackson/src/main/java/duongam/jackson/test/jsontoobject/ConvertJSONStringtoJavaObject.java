package duongam.jackson.test.jsontoobject;

import com.fasterxml.jackson.databind.ObjectMapper;

import duongam.jackson.model.Book;

public class ConvertJSONStringtoJavaObject {

	public static void main(String[] args) {
		try {
			// JSON string
			String json = "{\"title\":\"Thinking in Java\",\"isbn\":\"978-0131872486\""
					+ ",\"year\":1998,\"authors\":[\"Bruce Eckel\"]}";

			// create object mapper instance
			ObjectMapper mapper = new ObjectMapper();

			// convert JSON string to Book object
			Book book = mapper.readValue(json, Book.class);

			// print book
			System.out.println(book);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
