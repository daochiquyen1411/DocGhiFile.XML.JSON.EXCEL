package duongam.xmldemo.test;

import java.io.File;
import java.util.Arrays;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import duongam.xmldemo.model.Department;
import duongam.xmldemo.model.Employee;

public class ConvertJavaObjectToXMLFile {
	public static void main(String[] args) {
		Department department = new Department();
		Employee employee = new Employee(1, "Lokesh", "Gupta", department);

		employee.setHobbies(Arrays.asList("Swimming", "Playing", "Karate"));

		jaxbObjectToXML(employee);
	}

	private static void jaxbObjectToXML(Employee employee) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML

			// Convert Object to XML format (to file)
			jaxbMarshaller.marshal(employee, new File("employee.xml"));

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}