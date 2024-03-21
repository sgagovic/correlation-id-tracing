package service;

import model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployees();

    Employee addEmployee(Employee employee);

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);

    Employee deleteEmployee(Long id);

    String getEmployeeName(Long id);
}
