package fr.istic.taa.jaxrs.dao;

import fr.istic.taa.jaxrs.dao.generic.AbstractJpaDao;
import fr.istic.taa.jaxrs.domain.Department;

public class DepartmentDao extends AbstractJpaDao<Long, Department>{

    public DepartmentDao() {
        super(Department.class);
    }
}
