package duongam.gson.test.jsontoobject;

import com.google.gson.Gson;

import duongam.gson.model.Book;

public class ConvertJSONStringtoJavaObject {

	public static void main(String[] args) {
		try {
		    // JSON string
		    String json = "{\"title\":\"Thinking in Java\",\"isbn\":\"978-0131872486\"" +
		            ",\"year\":1998,\"authors\":[\"Bruce Eckel\"]}";
		    
		    System.out.println(json);

		    // create Gson instance
		    Gson gson = new Gson();

		    // convert JSON string to Book object
		    Book book = gson.fromJson(json, Book.class);

		    // print book
		    System.out.println(book);

		} catch (Exception ex) {
		    ex.printStackTrace();
		}
	}

}
