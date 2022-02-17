package duongam.jackson.test.objecttojson;

import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

import duongam.jackson.model.Book;

public class WriteJavaObjecttoJSONFile {

	public static void main(String[] args) {
		try {
			// create book object
			Book book = new Book("Thinking in Java", "978-0131872486", 1998, new String[] { "Bruce Eckel" });

			// create object mapper instance
			ObjectMapper mapper = new ObjectMapper();

			// convert book object to JSON file
			mapper.writeValue(Paths.get("book.json").toFile(), book);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
