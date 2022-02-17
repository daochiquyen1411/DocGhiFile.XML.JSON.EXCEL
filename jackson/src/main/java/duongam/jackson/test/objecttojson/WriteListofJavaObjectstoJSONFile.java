package duongam.jackson.test.objecttojson;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import duongam.jackson.model.Book;

public class WriteListofJavaObjectstoJSONFile {

	public static void main(String[] args) {
		try {
		    // create books list
		    List<Book> books = Arrays.asList(
		            new Book("Thinking in Java", "978-0131872486", 1998,
		                    new String[]{"Bruce Eckel"}),
		            new Book("Head First Java", "0596009208", 2003,
		                    new String[]{"Kathy Sierra", "Bert Bates"})
		    );

		    // create object mapper instance
		    ObjectMapper mapper = new ObjectMapper();

		    // convert book object to JSON file
		    mapper.writeValue(Paths.get("books.json").toFile(), books);

		} catch (Exception ex) {
		    ex.printStackTrace();
		}
	}

}
