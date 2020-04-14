package com.naver.s3.robot;

public class Robot {
	private LeftArm leftArm;
	private RightArm rightArm;
	
	//생성자
	public Robot() {
		// TODO Auto-generated constructor stub
	}
	
	public Robot(LeftArm leftArm, RightArm rightArm) {
		this.leftArm = leftArm;
		this.rightArm = rightArm;
	}
	
	//setter,getter
	public LeftArm getLeftArm() {
		return leftArm;
	}
	public void setLeftArm(LeftArm leftArm) {
		this.leftArm = leftArm;
	}
	public RightArm getRightArm() {
		return rightArm;
	}
	public void setRightArm(RightArm rightArm) {
		this.rightArm = rightArm;
	}
	
	
}
