package api.rest.Apirest.repositories;

import api.rest.Apirest.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findEmployeeByName(String name);
    List<Employee> findEmployeeBySurname(String surname);
    List<Employee> findEmployeeByEmail(String email);
    @Query(value = "select new map(e.job as job, count(e) as count ) from Employee e group by e.job")
    List<?> findDistinctCountByJob();


}
