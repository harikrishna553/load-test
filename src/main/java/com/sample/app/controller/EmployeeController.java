package com.sample.app.controller;

import java.util.Collection;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.app.model.Employee;
import com.sample.app.util.EmployeeUtil;

@RestController
@RequestMapping("api/v1/")
public class EmployeeController {

	@RequestMapping(value = "cached/employees", method = RequestMethod.GET)
	public ResponseEntity<Collection<Employee>> cachedEmps() {
		return ResponseEntity.ok(EmployeeUtil.cachedEmps());
	}

	@RequestMapping(value = "employees", method = RequestMethod.GET)
	public ResponseEntity<Collection<Employee>> all() throws InterruptedException {
		return ResponseEntity.ok(EmployeeUtil.allFromDB());
	}
}
