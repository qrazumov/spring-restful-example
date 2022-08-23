package tech.razymov.restfull.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.razymov.restfull.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}