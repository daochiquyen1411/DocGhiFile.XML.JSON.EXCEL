package duongam.gson.test.objectojson;

import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

import duongam.gson.model.Book;

public class ConvertListofJavaObjectstoJSONArray {

	public static void main(String[] args) {
		try {
			// create books list
			List<Book> books = Arrays.asList(
					new Book("Thinking in Java", "978-0131872486", 1998, new String[] { "Bruce Eckel" }),
					new Book("Head First Java", "0596009208", 2003, new String[] { "Kathy Sierra", "Bert Bates" }));

			// create Gson instance
			Gson gson = new Gson();

			// create a writer
			Writer writer = Files.newBufferedWriter(Paths.get("books.json"));

			// convert books object to JSON file
			gson.toJson(books, writer);

			// close writer
			writer.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
