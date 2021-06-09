package com.javaex.ex01;

public class Person {
	protected String name;
	protected String hp;
	
	
	//생성자
	
	public Person(String name, String hp) {
		super();
		this.name = name;
		this.hp = hp;
	}



	
	//메소드 g/s
	
	public String getName() {
		return name;
	}


	public String getHp() {
		return hp;
	}


	public void setName(String name) {
		this.name = name;
	}




	public void setHp(String hp) {
		this.hp = hp;
	}
	
	//메소드 일반
	
	public void showInfo() {
		System.out.println("이름"+name+","+ "#핸드폰:"+hp);
	}
	
}
