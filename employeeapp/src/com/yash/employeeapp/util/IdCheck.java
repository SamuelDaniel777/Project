package com.yash.employeeapp.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import com.yash.employeeapp.fileio.FileIn;
import com.yash.employeeapp.model.Employee;

public class IdCheck {
	public static boolean checker(Integer id) throws ClassNotFoundException, IOException {
		FileIn fi=new FileIn();
		String str= id.toString();
		Pattern patt = Pattern.compile("[0-9]*");
		Matcher m = patt.matcher(str);
		if (m.find()==true) {
			ArrayList<Employee>e= fi.fileIn();
			List<Integer>em=e.stream()
					.map(p->p.getEmpId())
					.collect(Collectors.toList());
			Predicate<Integer>equalOrNot=e1->e1.equals(id);
			return  equalOrNot.test(id);
		} else {
			return false;
		}
	}
}
