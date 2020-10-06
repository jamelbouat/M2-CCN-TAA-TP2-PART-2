package fr.istic.taa.jaxrs.services;

import fr.istic.taa.jaxrs.dao.CardDao;
import fr.istic.taa.jaxrs.domain.Card;
import fr.istic.taa.jaxrs.dto.CardDto;

public class CardService {
	
	private CardDao cardDao = new CardDao();
	
	public void createCard(CardDto cardDto) {
		Card card = new Card();
		card.setLabel(cardDto.getLabel());
		cardDao.save(card);
	}

	public CardDto getCard(long cardId) {
		Card card = cardDao.findOne(cardId);
		
		return createCardDto(card);
	}
	
	public void deleteCard(Long cardId) {
		cardDao.deleteById(cardId);
	}

	public CardDto updateCard(CardDto cardDto) {
		Card card = cardDao.findOne(cardDto.getId());
		card.setLabel(cardDto.getLabel());
		card.setDeadline(cardDto.getDeadline());
		card.setEmployee(cardDto.getEmployee());
		card.setDuration(cardDto.getDuration());
		card.setTag(cardDto.getTag());
		card.setSection(cardDto.getSection());
		card.setUrl(cardDto.getUrl());
	
		cardDao.update(card);
		
		return createCardDto(card);
	}
	
	private CardDto createCardDto(Card card) {
		CardDto cardDto = new CardDto();
		cardDto.setId(card.getId());
		cardDto.setLabel(card.getLabel());
		
		return cardDto;
	}

}
