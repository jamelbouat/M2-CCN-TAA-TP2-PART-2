package fr.istic.taa.jaxrs.services;

import fr.istic.taa.jaxrs.dao.DepartmentDao;
import fr.istic.taa.jaxrs.domain.Department;
import fr.istic.taa.jaxrs.dto.DepartmentDto;

public class DepartmentService {
	
	private DepartmentDao departmentDao = new DepartmentDao();
	
	public void createDepartment(DepartmentDto departmentDto) {
		Department department = new Department();
		department.setName(departmentDto.getName());
		departmentDao.save(department);
	}

	public DepartmentDto getDepartment(long departmentId) {
		Department department = departmentDao.findOne(departmentId);
		
		return createDepartmentDto(department);
	}
	
	public void deleteDepartment(Long departmentId) {
		departmentDao.deleteById(departmentId);
	}

	public DepartmentDto updateDepartment(DepartmentDto departmentDto) {
		Department department = departmentDao.findOne(departmentDto.getId());
		department.setName(departmentDto.getName());
		department.setEmployees(departmentDto.getEmployees());
		departmentDao.update(department);
		
		return createDepartmentDto(department);
	}
	
	private DepartmentDto createDepartmentDto(Department department) {
		DepartmentDto departmentDto = new DepartmentDto();
		departmentDto.setId(department.getId());
		departmentDto.setName(department.getName());
		
		return departmentDto;
	}

}
