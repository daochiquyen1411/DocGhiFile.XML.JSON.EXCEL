package duongam.gson.test.jsontoobject;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

import duongam.gson.model.Book;

public class ConvertJSONArraytoListofJavaObjects {

	public static void main(String[] args) {
		try {
			// create Gson instance
			Gson gson = new Gson();

			// create a reader
			Reader reader = Files.newBufferedReader(Paths.get("books.json"));

			// convert JSON array to list of books
			List<Book> books = Arrays.asList(gson.fromJson(reader, Book[].class));

			// print books
			for(Book book : books) {
				System.out.println(book);
			}

			// close reader
			reader.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
