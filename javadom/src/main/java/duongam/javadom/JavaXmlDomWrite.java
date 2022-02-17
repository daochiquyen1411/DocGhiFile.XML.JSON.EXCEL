package duongam.javadom;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class JavaXmlDomWrite {

	public static void main(String[] args) throws ParserConfigurationException, TransformerException {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.newDocument();

		Element root = doc.createElementNS("zetcode.com", "users");
		doc.appendChild(root);

		root.appendChild(createUser(doc, "1", "Robert", "Brown", "programmer"));
		root.appendChild(createUser(doc, "2", "Pamela", "Kyle", "writer"));
		root.appendChild(createUser(doc, "3", "Peter", "Smith", "teacher"));

		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transf = transformerFactory.newTransformer();

		transf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		transf.setOutputProperty(OutputKeys.INDENT, "yes");
		transf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

		DOMSource source = new DOMSource(doc);

		File myFile = new File("users.xml");
		StreamResult file = new StreamResult(myFile);
		transf.transform(source, file);

		StreamResult console = new StreamResult(System.out);
		transf.transform(source, console);
	}

	private static Node createStudent(Document doc, String studentId, String fullName, String facultyId,
			String facultyName, ArrayList<String> scores) {
		Element student = doc.createElement("student");
		student.setAttribute("id", studentId);
		student.appendChild(createElement(doc, "fullname", fullName));

		Element faculty = doc.createElement("faculty");
		faculty.appendChild(createElement(doc, "facultyid", facultyId));
		faculty.appendChild(createElement(doc, "facultyname", facultyName));
		
		student.appendChild(faculty);
		
		return student;
			
//		student.appendChild(createFaculty(doc, "1", "FACULTY"));
	}
//	private static Node createFaculty(Document doc, String id, String name) {
//		Element student = doc.createElement("faculty");
//		student.setAttribute("id", id);
//		student.appendChild(createElement(doc, "fullname", name));
//		return student;
//	}

	private static Node createElement(Document doc, String name, String value) {

		Element node = doc.createElement(name);
		node.appendChild(doc.createTextNode(value));

		return node;
	}

	private static Node createUser(Document doc, String id, String firstName, String lastName, String occupation) {

		Element user = doc.createElement("user");

		user.setAttribute("id", id);
		user.appendChild(createUserElement(doc, "firstname", firstName));
		user.appendChild(createUserElement(doc, "lastname", lastName));
		user.appendChild(createUserElement(doc, "occupation", occupation));

		return user;
	}

	private static Node createUserElement(Document doc, String name, String value) {

		Element node = doc.createElement(name);
		node.appendChild(doc.createTextNode(value));

		return node;
	}
}
