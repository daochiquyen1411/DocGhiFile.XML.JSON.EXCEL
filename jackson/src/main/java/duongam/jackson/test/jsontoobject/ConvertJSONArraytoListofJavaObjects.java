package duongam.jackson.test.jsontoobject;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import duongam.jackson.model.Book;

public class ConvertJSONArraytoListofJavaObjects {

	public static void main(String[] args) {
		try {
			// create object mapper instance
			ObjectMapper mapper = new ObjectMapper();

			// convert JSON array to list of books
			List<Book> books = Arrays.asList(mapper.readValue(Paths.get("books.json").toFile(), Book[].class));

			// print books
			for (Book book : books) {
				System.out.println(book);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
