package DocQT.DocquityWeb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import DocQT.DocquityWeb.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	public Employee findById(int id);

}
