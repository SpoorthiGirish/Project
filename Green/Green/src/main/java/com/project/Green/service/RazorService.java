package com.project.Green.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.project.Green.controller.RazorController;
import com.project.Green.model.Razor;

@Service
public class RazorService {

	@Autowired
	JdbcTemplate jdbcTemplate;

	Logger log = LoggerFactory.getLogger(RazorService.class);

	public void insertData() {
		
		log.info("Inserting data");
		jdbcTemplate.execute(
				"INSERT INTO RAZOR(id,brand,razorname,price,razordescription) VALUES(3,'brand1','abc',100,'smooth blade')");
		

		log.info("Done.");

	}

	private static final class RazorMapper implements RowMapper<Razor> {
	    public Razor mapRow(ResultSet rs, int rowNum) throws SQLException {
	      Razor raz = new Razor();
	      raz.setId(rs.getInt("id"));
	      raz.setBrand(rs.getString("brand"));
	      raz.setRazorname(rs.getString("Razorname"));
	      raz.setPrice(rs.getInt("price"));
	      raz.setRazordescription(rs.getString("Razordescription"));
	      return raz;
	    }
	  }
	
	public List<Razor> readData() {
		log.info("read");
	    return this.jdbcTemplate.query("SELECT * FROM RAZOR", new RazorMapper());
	  }


	public void updateData() {
		log.info("updating");
		jdbcTemplate.update("UPDATE RAZOR SET BRAND = 'brand2' WHERE ID = 3");
	}

	public void deleteData() {
		log.info("deleting");
		jdbcTemplate.update("DELETE from RAZOR WHERE ID = 3");
	}

}
