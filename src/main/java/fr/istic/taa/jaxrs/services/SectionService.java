package fr.istic.taa.jaxrs.services;

import fr.istic.taa.jaxrs.dao.SectionDao;
import fr.istic.taa.jaxrs.domain.Section;
import fr.istic.taa.jaxrs.dto.SectionDto;

public class SectionService {
	
	private SectionDao sectionDao = new SectionDao();
	
	public void createSection(SectionDto sectionDto) {
		Section section = new Section();
		section.setName(sectionDto.getName());
		sectionDao.save(section);
	}

	public SectionDto getSection(long sectionId) {
		Section section = sectionDao.findOne(sectionId);
		
		return createSectionDto(section);
	}
	
	public void deleteSection(Long sectionId) {
		sectionDao.deleteById(sectionId);
	}

	public SectionDto updateSection(SectionDto sectionDto) {
		Section section = sectionDao.findOne(sectionDto.getId());
		section.setName(sectionDto.getName());
		section.setKanban(sectionDto.getKanban());
		section.setCards(sectionDto.getCards());
		sectionDao.update(section);
		
		return createSectionDto(section);
	}
	
	private SectionDto createSectionDto(Section section) {
		SectionDto sectionDto = new SectionDto();
		sectionDto.setId(section.getId());
		sectionDto.setName(section.getName());
		
		return sectionDto;
	}

}
