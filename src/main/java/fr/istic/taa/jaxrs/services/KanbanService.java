package fr.istic.taa.jaxrs.services;

import fr.istic.taa.jaxrs.dao.KanbanDao;
import fr.istic.taa.jaxrs.domain.Kanban;
import fr.istic.taa.jaxrs.dto.KanbanDto;

public class KanbanService {
	
	private KanbanDao kanbanDao = new KanbanDao();
	
	public void createKanban(KanbanDto kanbanDto) {
		Kanban kanban = new Kanban();
		kanban.setName(kanbanDto.getName());
		kanbanDao.save(kanban);
	}

	public KanbanDto getKanban(long kanbanId) {
		Kanban kanban = kanbanDao.findOne(kanbanId);
		
		return createKanbanDto(kanban);
	}
	
	public void deleteKanban(Long kanbanId) {
		kanbanDao.deleteById(kanbanId);
	}

	public KanbanDto updateKanban(KanbanDto kanbanDto) {
		Kanban kanban = kanbanDao.findOne(kanbanDto.getId());
		kanban.setName(kanbanDto.getName());
		kanban.setSections(kanbanDto.getSections());
		kanbanDao.update(kanban);
		
		return createKanbanDto(kanban);
	}
	
	private KanbanDto createKanbanDto(Kanban kanban) {
		KanbanDto kanbanDto = new KanbanDto();
		kanbanDto.setId(kanban.getId());
		kanbanDto.setName(kanban.getName());
		kanbanDto.setSections(kanban.getSections());
		
		return kanbanDto;
	}

}
