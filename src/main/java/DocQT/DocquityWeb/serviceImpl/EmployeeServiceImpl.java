package DocQT.DocquityWeb.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DocQT.DocquityWeb.model.Employee;
import DocQT.DocquityWeb.repository.EmployeeRepository;
import DocQT.DocquityWeb.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> findAllEmployee() {
		List<Employee> listEmployee = (List<Employee>) employeeRepository.findAll();
		return listEmployee;
	}

	@Override
	public Employee getEmployeeById(int id) {
		Employee employee = employeeRepository.findById(id);
		return employee;
	}

	@Override
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployeeById(int id) {
		employeeRepository.deleteById(id);
	}

}
