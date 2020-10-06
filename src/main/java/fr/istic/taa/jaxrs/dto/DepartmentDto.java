package fr.istic.taa.jaxrs.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import fr.istic.taa.jaxrs.domain.Employee;

@XmlRootElement(name = "Employee")
public class DepartmentDto {

	private long id;
    private String name;
    private List<Employee> employees = new ArrayList<Employee>();
    
    @XmlElement(name = "id")
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	@XmlElement(name = "name")
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElementWrapper(name = "employees")
	@XmlElement(name = "employee")
	public List<Employee> getEmployees() {
		return employees;
	}
	
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}
