package fr.istic.taa.jaxrs.dao;

import fr.istic.taa.jaxrs.dao.generic.AbstractJpaDao;
import fr.istic.taa.jaxrs.domain.Employee;

public class EmployeeDao extends AbstractJpaDao<Long, Employee>{

    public EmployeeDao() {
        super(Employee.class);
    }
}
