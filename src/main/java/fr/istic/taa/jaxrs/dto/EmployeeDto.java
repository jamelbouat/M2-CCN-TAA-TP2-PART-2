package fr.istic.taa.jaxrs.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import fr.istic.taa.jaxrs.domain.Card;
import fr.istic.taa.jaxrs.domain.Department;

@XmlRootElement(name = "Employee")
public class EmployeeDto {

	private long id;
    private String name;
    private Department department;
    private Card card;
    
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
	
	@XmlElement(name = "department")
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	@XmlElementWrapper(name = "cards")
	@XmlElement(name = "card")
	public Card getCard() {
		return card;
	}
	
	public void setCard(Card card) {
		this.card = card;
	}
    
    
}
