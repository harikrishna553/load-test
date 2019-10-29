package com.sample.app.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.app.model.Employee;
import com.sample.app.util.EmployeeUtil;

@RestController
@RequestMapping("api/v1/")
public class EmployeeController {

	@RequestMapping(value = "employees", method = RequestMethod.GET)
	public Collection<Employee> all() throws InterruptedException {
		return EmployeeUtil.all();
	}

	@RequestMapping(value = "employees", method = RequestMethod.POST)
	public Employee create(@RequestBody Employee emp) throws InterruptedException {
		return EmployeeUtil.create(emp);
	}

	@RequestMapping(value = "employees/{id}", method = RequestMethod.GET)
	public Employee byId(@PathVariable int id) throws InterruptedException {
		return EmployeeUtil.byId(id);
	}

	@RequestMapping(value = "employees/{id}", method = RequestMethod.DELETE)
	public Employee deleteById(@PathVariable int id) throws InterruptedException {
		return EmployeeUtil.delete(id);
	}

	@RequestMapping(value = "employees/{id}", method = RequestMethod.PUT)
	public Employee updateById(@PathVariable int id, @RequestBody Employee emp) throws InterruptedException {
		return EmployeeUtil.updateById(id, emp);
	}

	@RequestMapping(value = "cached/employees", method = RequestMethod.GET)
	public Collection<Employee> all_cached() throws InterruptedException {
		return EmployeeUtil.all_cached();
	}

	@RequestMapping(value = "cached/employees", method = RequestMethod.POST)
	public Employee create_cached(@RequestBody Employee emp) throws InterruptedException {
		return EmployeeUtil.create_cached(emp);
	}

	@RequestMapping(value = "cached/employees/{id}", method = RequestMethod.GET)
	public Employee byId_cached(@PathVariable int id) throws InterruptedException {
		return EmployeeUtil.byId_cached(id);
	}

	@RequestMapping(value = "cached/employees/{id}", method = RequestMethod.DELETE)
	public Employee deleteById_cached(@PathVariable int id) throws InterruptedException {
		return EmployeeUtil.delete_cached(id);
	}

	@RequestMapping(value = "cached/employees/{id}", method = RequestMethod.PUT)
	public Employee updateById_cached(@PathVariable int id, @RequestBody Employee emp) throws InterruptedException {
		return EmployeeUtil.updateById_cached(id, emp);
	}

}