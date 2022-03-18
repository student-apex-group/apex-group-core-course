package crud.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import crud.app.entity.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer>{

}
