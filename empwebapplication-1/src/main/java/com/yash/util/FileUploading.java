package com.yash.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.yash.controller.EmployeeController;

@Component
public class FileUploading {
	static Logger logger=LoggerFactory.getLogger(EmployeeController.class);
	public boolean setFile(MultipartFile file) {
		
		String save_DIR="C:\\Users\\benny\\Desktop\\yash training\\"
				+ "Trainee Code\\sts\\empwebapplication-1\\src\\main\\"
				+ "resources\\static\\img";
		try {
			logger.trace("In Set File Method");
			Files.copy(file.getInputStream(),Paths.get(save_DIR+File.separator+file.getOriginalFilename()),StandardCopyOption.REPLACE_EXISTING);
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
}
