package duongam.jackson.test.objecttojson;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class WriteJavaMaptoJSONFile {

	public static void main(String[] args) {
		try {
			// create a map
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("name", "John Deo");
			map.put("email", "john.doe@example.com");
			map.put("roles", new String[] { "Member", "Admin" });
			map.put("admin", true);

			// create object mapper instance
			ObjectMapper mapper = new ObjectMapper();

			// convert map to JSON file
			mapper.writeValue(Paths.get("user.json").toFile(), map);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
