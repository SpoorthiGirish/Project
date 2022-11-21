package com.example.config;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.excel.RowMapper;
import org.springframework.batch.item.excel.mapping.BeanWrapperRowMapper;
import org.springframework.batch.item.excel.poi.PoiItemReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;

import com.example.model.StudentDTO;
 
@Configuration
public class ExcelFileToDatabaseJobConfig {
	 @Bean
	    ItemReader<StudentDTO> excelStudentReader() {
	        PoiItemReader<StudentDTO> reader = new PoiItemReader<>();
	        reader.setLinesToSkip(1);
	        reader.setResource(new ClassPathResource("data/students.xlsx"));
	        reader.setRowMapper(excelRowMapper());
	        return reader;
	    }
	 
	    private RowMapper<StudentDTO> excelRowMapper() {
	        BeanWrapperRowMapper<StudentDTO> rowMapper = new BeanWrapperRowMapper<>();
	        rowMapper.setTargetType(StudentDTO.class);
	        return rowMapper;
	    }
}
