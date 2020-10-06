package fr.istic.taa.jaxrs.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import fr.istic.taa.jaxrs.domain.Employee;
import fr.istic.taa.jaxrs.domain.Section;

@XmlRootElement(name = "Card")
public class CardDto {

	private long id;
    private String label;
    private String deadline;
    private Employee employee;
    private int duration;
    private String tag;
    private Section section;
    private String url;
    
    @XmlElement(name = "id")
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@XmlElement(name = "label")
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
	@XmlElement(name = "deadline")
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	
	@XmlElement(name = "employee")
	public Employee getEmployee() {
		return employee;
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	@XmlElement(name = "duration")
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	@XmlElement(name = "tag")
	public String getTag() {
		return tag;
	}
	
	public void setTag(String tag) {
		this.tag = tag;
	}
	
	@XmlElement(name = "section")
	public Section getSection() {
		return section;
	}
	
	public void setSection(Section section) {
		this.section = section;
	}
	
	@XmlElement(name = "url")
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
}
