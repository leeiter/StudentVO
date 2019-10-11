package com.biz.lombok.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.lombok.domain.StudentVO;
import com.biz.lombok.utils.StudentInfo;

import lombok.Getter;

@Getter
public class StudentReadServiceV1 {

	private List<StudentVO> stdList;
	
	public List<StudentVO> getStdList() {
		return this.stdList;
	}

	/*
	 * 파일로부터 학생정보를 읽어서 stdList에 저장
	 */
	public void readStudent(String fileName) throws IOException {
		
		stdList = new ArrayList<StudentVO>();
		
		FileReader fileReader;
		BufferedReader buffer;
		
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			if(reader == null) break;
			
			String[] stds = reader.split(":");
			StudentVO stdVO = new StudentVO();
			stdVO.setS_num(stds[StudentInfo.LIST.NUM]);
			stdVO.setS_name(stds[StudentInfo.LIST.NAME]);
			stdVO.setS_tel(stds[StudentInfo.LIST.TEL]);
			stdVO.setS_addr(stds[StudentInfo.LIST.ADDR]);
			stdVO.setS_dept(stds[StudentInfo.LIST.DEPT]);
			
			int grade = Integer.valueOf(stds[StudentInfo.LIST.GRADE]);
			stdVO.setS_grade(grade);
			
			stdList.add(stdVO);
			
			System.out.println(stdVO);
		}
		buffer.close();
		fileReader.close();
		
	}
}