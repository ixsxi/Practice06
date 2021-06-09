package com.javaex.ex01;

public class Customer extends Person{
	private int cNO;
	private int point;
	
	
	
	//생성자
	
	public Customer(String name, String hp, int cNO, int point) {
		super(name, hp);
		this.cNO = cNO;
		this.point = point;
	}



	
	
	//메소드 g/s
	
	public int getcNO() {
		return cNO;
	}

	public int getPoint() {
		return point;
	}

	public void setcNO(int cNO) {
		this.cNO = cNO;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	//메소드 일반
	public void showInfo() {
		System.out.println("이름"+name+","+ "#핸드폰:"+hp+","+"#고객번호:"+cNO+","+"#포인트 점수:"+point);
	}
	
}
