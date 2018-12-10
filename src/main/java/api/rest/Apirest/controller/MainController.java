package api.rest.Apirest.controller;

import api.rest.Apirest.entities.Employee;
import api.rest.Apirest.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("api/employees")
@RestController
public class MainController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public Iterable<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @PostMapping
    public Employee addEmployee(@Valid Employee employee){
        return employeeRepository.save(employee);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Employee getEmployeeById(@PathVariable(value = "id") Long id){
        return employeeRepository.findById(id);
    }

    @GetMapping("/{name}")
    public Employee getEmployeeByName(@PathVariable(value = "name") String name){
        return employeeRepository.findByName(name);
    }

    @GetMapping("/{surname}")
    public Employee getEmployeeBySurname(@PathVariable(value = "surname") String surname){
        return employeeRepository.findBySurname(surname);
    }

    @GetMapping("/{mail}")
    public Employee getEmployeeByMail(@PathVariable(value = "mail") String mail){
        return employeeRepository.findByMail(mail);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Employee deleteById(@PathVariable(value = "id") Long id){
        return employeeRepository.deleteById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Employee updateById(@PathVariable(value = "id") @Valid @RequestBody Long id, Employee employeeDetails){
        Employee employee = employeeRepository.deleteById(id);
        employee.setName(employeeDetails.getName());
        employee.setSurname(employeeDetails.getSurname());
        employee.setJob(employeeDetails.getJob());
        employee.setMail(employeeDetails.getMail());
        Employee updateEmployee = employeeRepository.save(employee);
        return updateEmployee;
    }

    @RequestMapping(value = "/jobs", method = RequestMethod.GET)
    @ResponseBody
    public String jobs() {
        return employeeRepository.findDistinctCountByJob().toString();
    }

}
