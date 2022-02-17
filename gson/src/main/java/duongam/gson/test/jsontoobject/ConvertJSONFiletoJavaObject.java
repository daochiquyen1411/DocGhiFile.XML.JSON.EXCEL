package duongam.gson.test.jsontoobject;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;

import duongam.gson.model.Book;

public class ConvertJSONFiletoJavaObject {

	public static void main(String[] args) {
		try {
			// create Gson instance
			Gson gson = new Gson();

			// create a reader
			Reader reader = Files.newBufferedReader(Paths.get("book.json"));

			// convert JSON string to Book object
			Book book = gson.fromJson(reader, Book.class);

			// print book
			System.out.println(book);

			// close reader
			reader.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
