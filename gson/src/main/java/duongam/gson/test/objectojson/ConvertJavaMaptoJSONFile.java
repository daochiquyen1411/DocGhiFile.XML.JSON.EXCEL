package duongam.gson.test.objectojson;

import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

public class ConvertJavaMaptoJSONFile {

	public static void main(String[] args) {
		try {
		    // create book map
		    Map<String, Object> map = new HashMap<String, Object>();
		    map.put("title", "Thinking in Java");
		    map.put("isbn", "978-0131872486");
		    map.put("year", 1998);
		    map.put("authors", new String[]{"Bruce Eckel"});

		    // create Gson instance
		    Gson gson = new Gson();

		    // create a writer
		    Writer writer = Files.newBufferedWriter(Paths.get("map-book.json"));

		    // convert book object to JSON file
		    gson.toJson(map, writer);

		    // close writer
		    writer.close();

		} catch (Exception ex) {
		    ex.printStackTrace();
		}
	}

}
