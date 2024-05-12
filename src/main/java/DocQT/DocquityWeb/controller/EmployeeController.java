package DocQT.DocquityWeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DocQT.DocquityWeb.model.Employee;
import DocQT.DocquityWeb.service.EmployeeService;

@CrossOrigin("*")
@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/")
	public List<Employee> findAllEmployee() {
		List<Employee> listEmployee = employeeService.findAllEmployee();
		return listEmployee;
	}

	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		Employee employee = employeeService.getEmployeeById(id);
		return employee;
	}

	@DeleteMapping("/{id}")
	public String deleteEmployeeById(@PathVariable int id) {
		employeeService.deleteEmployeeById(id);
		return "employee deleted successfully.......";
	}

	@PostMapping("/")
	public String addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
		return "employee added successfully..........";
	}

	@PutMapping("/{id}")
	public String updateEmployee(@RequestBody Employee employee, @PathVariable int id) {
		employeeService.updateEmployee(employee, id);
		return "employee updated successfully..........";
	}

}
