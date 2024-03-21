package controller;

import model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

public class EmployeeController {


    @GetMapping("/employee/name/{id}")
    public ResponseEntity<String> getEmployeeName(@PathVariable("id") Long id){
        return ResponseEntity.ok("hello");
    }

    @GetMapping("/employee")
    public ResponseEntity<List<String>> getEmployees(){
        return ResponseEntity.ok(new ArrayList<>());
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id){
        return ResponseEntity.ok(new Employee());
    }


}
