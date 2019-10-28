package com.cega.miniclonpastebin.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.cega.miniclonpastebin.model.Employee;
import com.cega.miniclonpastebin.service.EmployeeService;

@CrossOrigin
@RestController
@RequestMapping(path="/employees",produces="application/json")
public class EmployeeController {

	private EmployeeService employeeService;
	
	
	private final Logger logger = Logger.getLogger(this.getClass().getName());;
	
	@Autowired
	public EmployeeController(EmployeeService employeeService){
		this.employeeService = employeeService;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee> findById(@PathVariable Long id){
		Optional<Employee> employeeOptional = employeeService.findById(id);
		if(employeeOptional.isPresent()) {
			return new ResponseEntity<>(employeeOptional.get(),HttpStatus.OK);
		}
		return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
	}
	
	
	@GetMapping
	public List<Employee> findAll(){
		return employeeService.findAll();
	}
	
	@PostMapping
	public Employee save(@RequestBody Employee employee) {
		return employeeService.save(employee);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		employeeService.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public Employee update(@RequestBody Employee employee) {
		return employeeService.save(employee);
		
	}
}
