package duongam.jackson.test.objecttojson;

import java.nio.file.Paths;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import duongam.jackson.model.Book;

public class WriteJavaObjecttoPrettyPrintJSONFile {

	public static void main(String[] args) {
		try {
			// create book object
			Book book = new Book("Thinking in Java", "978-0131872486", 1998, new String[] { "Bruce Eckel" });

			// create object mapper instance
			ObjectMapper mapper = new ObjectMapper();

			// create an instance of DefaultPrettyPrinter
			ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());

			// convert book object to JSON file
			writer.writeValue(Paths.get("pretty-book.json").toFile(), book);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
