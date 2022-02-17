package duongam.gson.test.objectojson;

import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;

import duongam.gson.model.Book;

public class ConvertJavaObjecttoJSONFile {
	public static void main(String[] args) {
		try {
			// create book object
			Book book = new Book("Thinking in Java", "978-0131872486", 1998, new String[] { "Bruce Eckel" });

			// create Gson instance
			Gson gson = new Gson();

			// create a writer
			Writer writer = Files.newBufferedWriter(Paths.get("book.json"));

			// convert book object to JSON file
			gson.toJson(book, writer);

			// close writer
			writer.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
