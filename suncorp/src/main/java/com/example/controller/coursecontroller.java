package com.example.controller;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.coderslab.entity.Course;
import com.example.entity.course;

@Controller
@RequestMapping("/")
public class coursecontroller {
	private static final Logger logger = LoggerFactory.getLogger(coursecontroller.class);
	private static final String CSV_FILE_LOCATION = "C:\\Users\\spog\\28-March\\Project\\file.xlsx";
	@GetMapping
	public @ResponseBody List<course> readCSV(){
		List<course> courses = new ArrayList<>();

		Workbook workbook =null;
		try {
			// Creating a Workbook from an Excel file (.xls or .xlsx)
			workbook = WorkbookFactory.create(new File(CSV_FILE_LOCATION));

			// Retrieving the number of sheets in the Workbook
			logger.info("Number of sheets: ", workbook.getNumberOfSheets());
			// Print all sheets name
			//workbook.forEach(sheet -> { logger.info(" => " + sheet.getSheetName());
              workbook.forEach(sheet -> { logger.info(" => " + sheet.getSheetName()));
				// Create a DataFormatter to format and get each cell's value as String
				DataFormatter dataFormatter = new DataFormatter();

				//loop through all rows and columns and create Course object
				int index = 0;
				for(Row row : sheet) {
					if(index++ == 0) continue;
					course course = new course();
					course.setId(dataFormatter.formatCellValue(row.getCell(0)));
					course.setName(dataFormatter.formatCellValue(row.getCell(1)));
					try {
						course.setDob(sdf.parse(dataFormatter.formatCellValue(row.getCell(2))));
					} catch (ParseException e) {
						logger.error(e.getMessage(), e);
					}
					course.setMark(Integer.parseInt(dataFormatter.formatCellValue(row.getCell(3))));
					courses.add(course);
				}
			});
		} catch (EncryptedDocumentException | InvalidFormatException | IOException e) {
			logger.error(e.getMessage(), e);
		}finally {
			try {
				if(workbook != null) workbook.close();
			} catch (IOException e) {
				logger.error(e.getMessage(), e);
			}
		}

		return courses;
	}
}
