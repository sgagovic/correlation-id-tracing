package controller;

import model.Employee;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

public class EmployeeController {

    private static final Logger LOGGER =  LogManager.getLogger(EmployeeController.class);

    @GetMapping("/employee/name/{id}")
    public ResponseEntity<String> getEmployeeName(@PathVariable("id") Long id){
        LOGGER.info("Inside EmployeeController getEmployeeName method.");

        return ResponseEntity.ok("hello");
    }

    @GetMapping("/employee")
    public ResponseEntity<List<String>> getEmployees(){
        LOGGER.info("Inside EmployeeController getEmployees method.");
        return ResponseEntity.ok(new ArrayList<>());
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id){
        LOGGER.info("Inside EmployeeController getEmployeeById method.");
        return ResponseEntity.ok(new Employee());
    }


}
