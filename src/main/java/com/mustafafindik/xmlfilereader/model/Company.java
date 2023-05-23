package com.mustafafindik.xmlfilereader.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@JacksonXmlRootElement(localName = "company")
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    @JacksonXmlProperty(localName = "employee")
    @JacksonXmlElementWrapper(useWrapping = false)
    List<Employee> employees = new ArrayList<>();

    public List<Employee> getEmployees(){
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
