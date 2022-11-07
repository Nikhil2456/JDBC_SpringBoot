package com.nikhil.Demo.controller;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nikhil.Demo.entity.jdbcEntity;

public class jdbcMapper implements RowMapper {
  public jdbcEntity mapRow(ResultSet rs, int rowNum) throws SQLException{
	  jdbcEntity entity=new jdbcEntity(rs.getInt(1),rs.getString(2),rs.getInt(3));
	  return entity;
  }
}
