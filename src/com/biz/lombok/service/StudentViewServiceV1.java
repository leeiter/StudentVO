package com.biz.lombok.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.lombok.domain.StudentVO;

public class StudentViewServiceV1 extends StudentViewServiceABS {

	List<StudentVO> stdList = new ArrayList<StudentVO>();

	@Override
	public void view() {

		System.out.println("====================================================================");
		System.out.println("학생정보 v1");
		System.out.println("==========================================================================================");
		System.out.println("학번\t이름\t전화번호\t주소\t전공\t학년");
		System.out.println("----------------------------------------------------------------------------------");
		for(StudentVO vo : stdList) {
			System.out.print(vo.getS_num() + "\t");
			System.out.print(vo.getS_name() + "\t");
			System.out.print(vo.getS_tel() + "\t");
			System.out.print(vo.getS_addr() + "\t");
			System.out.print(vo.getS_dept() + "\t");
			System.out.print(vo.getS_grade() + "\n");
		}
		System.out.println("====================================================================");

	}

	@Override
	public void view(String strName) {
		


	}

	@Override
	public void view(int intGrade) {
		// TODO Auto-generated method stub

	}

	@Override
	public void view(int grGrade, int lessGrade) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
