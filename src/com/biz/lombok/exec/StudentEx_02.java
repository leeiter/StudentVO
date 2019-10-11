package com.biz.lombok.exec;

import java.io.IOException;
import java.util.List;

import com.biz.lombok.domain.StudentVO;
import com.biz.lombok.service.StudentReadServiceV1;
import com.biz.lombok.service.StudentViewServiceABS;
import com.biz.lombok.service.StudentViewServiceV1;

/*
 * 학생정보.txt 파일을 읽어서
 * 1. 모든 학생의 리스트를 콘솔에 보이기
 * 2. 이름을 입력받아 해당하는 학생 리스트를 콘솔에 보이기
 * 3. 학년을 입력받아 해당하는 학년의 학생들만 콘솔에 보이기
 * 4. 두개의 정수를 입력 받아 해당 범위의
 * 	학년에 해당하는 학생들만 콘솔에 보이기
 */
public class StudentEx_02 {

	public static void main(String[] args) {
		
		
		StudentReadServiceV1 sRead = new StudentReadServiceV1();
		StudentViewServiceABS sView = new StudentViewServiceV1();
		
		String fileName = "src/com/biz/lombok/학생정보.txt";
		
		try {
			sRead.readStudent(fileName);
			List<StudentVO> stdList = sRead.getStdList();
			
			sView.setStdList(stdList);
			
			sView.view();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
