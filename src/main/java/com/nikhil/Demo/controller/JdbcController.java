package com.nikhil.Demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nikhil.Demo.entity.jdbcEntity;

@RestController
@RequestMapping(value="/Jdbccourse")
public class JdbcController {
@Autowired JdbcTemplate jdbc;

@PostMapping
public boolean insert(HttpServletRequest request) {
	String name=request.getParameter("name");
	int duration=Integer.parseInt(request.getParameter("duration"));
	jdbc.execute("insert into course(name,duration) values('"+name+"',"+duration+")");
	return true;
}
@GetMapping
public List<jdbcEntity> getfromdatabase() {
	List <jdbcEntity> output = jdbc.query("Select * from dbo.course",new jdbcMapper());
	return output;
}
}