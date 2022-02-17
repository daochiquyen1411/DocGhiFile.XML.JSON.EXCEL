package duongam.gson.test.objectojson;

import com.google.gson.Gson;

import duongam.gson.model.Book;

public class ConvertJavaObjecttoJSONString {

	public static void main(String[] args) {
		try {
			// create book object
			Book book = new Book("Thinking in Java", "978-0131872486", 1998, new String[] { "Bruce Eckel" });

			// convert book object to JSON
			String json = new Gson().toJson(book);

			// print JSON string
			System.out.println(json);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
