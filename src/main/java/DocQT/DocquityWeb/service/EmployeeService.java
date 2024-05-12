package DocQT.DocquityWeb.service;

import java.util.List;

import DocQT.DocquityWeb.model.Employee;

public interface EmployeeService {

	public List<Employee> findAllEmployee();

	public Employee getEmployeeById(int id);

	public void addEmployee(Employee employee);

	public void updateEmployee(Employee employee, int id);

	public void deleteEmployeeById(int id);

}
