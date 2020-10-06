package fr.istic.taa.jaxrs.services;

import fr.istic.taa.jaxrs.dao.EmployeeDao;
import fr.istic.taa.jaxrs.domain.Employee;
import fr.istic.taa.jaxrs.dto.EmployeeDto;

public class EmployeeService {
	
	private EmployeeDao employeeDao = new EmployeeDao();
	
	public void createEmployee(EmployeeDto employeeDto) {
		Employee employee = new Employee();
		employee.setName(employeeDto.getName());
		employeeDao.save(employee);
	}

	public EmployeeDto getEmployee(long employeeId) {
		Employee employee = employeeDao.findOne(employeeId);
		
		return createEmployeeDto(employee);
	}
	
	public void deleteEmployee(Long employeeId) {
		employeeDao.deleteById(employeeId);
	}

	public EmployeeDto updateEmployee(EmployeeDto employeeDto) {
		Employee employee = employeeDao.findOne(employeeDto.getId());
		employee.setName(employeeDto.getName());
		employee.setDepartment(employeeDto.getDepartment());
		employee.setCard(employeeDto.getCard());
		employeeDao.update(employee);
		
		return createEmployeeDto(employee);
	}
	
	private EmployeeDto createEmployeeDto(Employee employee) {
		EmployeeDto employeeDto = new EmployeeDto();
		employeeDto.setId(employee.getId());
		employeeDto.setName(employee.getName());
		
		return employeeDto;
	}

}
