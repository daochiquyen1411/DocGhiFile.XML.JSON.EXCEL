package duongam.gson.test.jsontoobject;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

import com.google.gson.Gson;

public class ConvertJSONFiletoJavaMap {

	public static void main(String[] args) {
		try {
			// create Gson instance
			Gson gson = new Gson();

			// create a reader
			Reader reader = Files.newBufferedReader(Paths.get("map-book.json"));

			// convert JSON file to map
			Map<?, ?> map = gson.fromJson(reader, Map.class);

			// print map entries
			for (Map.Entry<?, ?> entry : map.entrySet()) {
				System.out.println(entry.getKey() + "=" + entry.getValue());
			}

			// close reader
			reader.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
