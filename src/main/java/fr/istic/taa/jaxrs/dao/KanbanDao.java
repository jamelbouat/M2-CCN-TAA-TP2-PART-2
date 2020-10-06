package fr.istic.taa.jaxrs.dao;

import fr.istic.taa.jaxrs.dao.generic.AbstractJpaDao;
import fr.istic.taa.jaxrs.domain.Kanban;

public class KanbanDao extends AbstractJpaDao<Long, Kanban>{

    public KanbanDao() {
        super(Kanban.class);
    }
}