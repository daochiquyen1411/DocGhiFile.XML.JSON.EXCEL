package duongam.jackson.test.jsontoobject;

import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

import duongam.jackson.model.Book;

public class ConvertJSONFiletoJavaObject {

	public static void main(String[] args) {
		try {
			// create object mapper instance
			ObjectMapper mapper = new ObjectMapper();

			// convert JSON string to Book object
			Book book = mapper.readValue(Paths.get("book.json").toFile(), Book.class);

			// print book
			System.out.println(book);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
