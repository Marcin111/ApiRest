package api.rest.Apirest.dao;


import api.rest.Apirest.entities.Employee;
import api.rest.Apirest.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeDAO {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee save(Employee emp){
        return employeeRepository.save(emp);
    }

    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    public Employee findOne(Long empid){
        return employeeRepository.findOne(empid);
    }

    public List<Employee> findName(String name){
        return employeeRepository.findEmployeeByName(name);
    }

    public List<Employee> findSurname(String surname){
        return employeeRepository.findEmployeeBySurname(surname);
    }

    public List<Employee> findEmail(String email){
        return employeeRepository.findEmployeeByEmail(email);
    }

    public List<?> jobCount(){
        return employeeRepository.findDistinctCountByJob();
    }

    public void delete(Employee emp){
        employeeRepository.delete(emp);
    }

}
