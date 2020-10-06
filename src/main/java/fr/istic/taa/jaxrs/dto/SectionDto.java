package fr.istic.taa.jaxrs.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import fr.istic.taa.jaxrs.domain.Card;
import fr.istic.taa.jaxrs.domain.Kanban;

@XmlRootElement(name = "Section")
public class SectionDto {
	
	private long id;
    private String name;
    private Kanban kanban;
    private List<Card> cards = new ArrayList<Card>();
    
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
	
	@XmlElement(name = "kanban")
	public Kanban getKanban() {
		return kanban;
	}
	
	public void setKanban(Kanban kanban) {
		this.kanban = kanban;
	}
	
	@XmlElementWrapper(name = "cards")
	@XmlElement(name = "card")
	public List<Card> getCards() {
		return cards;
	}
	
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}


}
