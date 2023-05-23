package com.mustafafindik.xmlfilereader;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.mustafafindik.xmlfilereader.model.Company;
import com.mustafafindik.xmlfilereader.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class XmlFileReaderApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(XmlFileReaderApplication.class, args);

		File file = new File("C:\\Users\\P2343\\Desktop\\Projects\\XML-File-Reader\\company.xml");
		ObjectMapper objectMapper = new XmlMapper();

		Company company = objectMapper.readValue(file, Company.class);
		Employee employee = objectMapper.readValue(file, Employee.class);
		System.out.println(company.getEmployees());
		System.out.printf(employee.getId("1"));


	}

}
