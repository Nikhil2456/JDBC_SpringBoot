package com.nikhil.Demo.dao;

import java.util.List;

import javax.sql.DataSource;

import com.nikhil.Demo.entity.jdbcEntity;

public interface jdbcDAO {
 
	public void setDataSource(DataSource ds);
	public List<jdbcEntity> listCourse();
}
