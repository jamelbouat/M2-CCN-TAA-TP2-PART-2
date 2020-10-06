package fr.istic.taa.jaxrs.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import fr.istic.taa.jaxrs.domain.Section;

@XmlRootElement(name = "Kanban")
public class KanbanDto {
	
	private long id;
    private String name;
    private List<Section> sections = new ArrayList<Section>();
    
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
	
	@XmlElementWrapper(name = "sections")
	@XmlElement(name = "section")
	public List<Section> getSections() {
		return sections;
	}
	
	public void setSections(List<Section> sections) {
		this.sections = sections;
	}
    
}
