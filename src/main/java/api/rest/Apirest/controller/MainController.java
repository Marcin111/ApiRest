package api.rest.Apirest.controller;

import api.rest.Apirest.entities.Employee;
import api.rest.Apirest.dao.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping ("/api")
public class MainController {

    @Autowired
    EmployeeDAO employeeDAO;

    @PostMapping("/employees")
    public Employee createEmployee(@Valid @RequestBody Employee emp){
        return employeeDAO.save(emp);
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeDAO.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable(value = "id") Long empid){
        return employeeDAO.findOne(empid);
    }

    @RequestMapping(value = "/employees/search/name", method = RequestMethod.GET)
    public List<Employee> getEmployeeByName(@RequestParam(value = "name") String name){
        return employeeDAO.findName(name);
    }

    @RequestMapping(value = "/employees/search/surname", method = RequestMethod.GET)
    public List<Employee> getEmployeeBySurname(@RequestParam(value = "surname") String surname){
        return employeeDAO.findSurname(surname);
    }

    //http://localhost:8080/api/employees/search/email?email=??
    @RequestMapping(value = "/employees/search/email", method = RequestMethod.GET)
    public List<Employee> getEmployeeByEmail(@RequestParam(value = "email") String email){
        return employeeDAO.findEmail(email);
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable(value = "id") Long empid, @Valid @RequestBody Employee empDetails){

        Employee emp=employeeDAO.findOne(empid);

        emp.setName(empDetails.getName());
        emp.setSurname(empDetails.getSurname());
        emp.setJob(empDetails.getJob());
        emp.setEmail(empDetails.getEmail());

        Employee updateEmployee=employeeDAO.save(emp);
        return updateEmployee;
    }

    @RequestMapping(value = "/employees/jobs", method = RequestMethod.GET)
    @ResponseBody
    public String jobsCount() {
        return employeeDAO.jobCount().toString();
    }

    @DeleteMapping("employees/{id}")
    public Employee deleteEmployee(@PathVariable(value = "id") Long empid){
        Employee emp=employeeDAO.findOne(empid);
        employeeDAO.delete(emp);
        return employeeDAO.findOne(empid);
    }

}
