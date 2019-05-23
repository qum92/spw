package com.osf.sp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.osf.sp.service.EmpService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class EmpController {
	@Autowired
	EmpService es;
	
	@RequestMapping(value="/emp",method=RequestMethod.GET)
	public @ResponseBody List<Map<String,String>> getEmps(@RequestParam Map<String,String> params) {
		log.info("params=>{}",params);
		List<Map<String,String>> empList = es.getEmps(Integer.parseInt(params.get("deptNo")));
		log.info("empList=>{}",empList);
		return empList;
	}
}
