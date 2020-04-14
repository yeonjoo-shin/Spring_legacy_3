package com.naver.s3.member;

public class MemberService {
	private MemberDAO memberDAO;
	//의존성 주입
	public void setMemberDAO(MemberDAO memberDAO) { //1.setter
		this.memberDAO = memberDAO;
	}
	
	public MemberService() {//2. 생성자
	}
	public MemberService(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	
	public void test() {
		memberDAO.test();
		System.out.println("MemberService");
	}
}
