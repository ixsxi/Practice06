package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		//User user1 =new User("jws","j1234","정우성");
		//System.out.println(user1.toString());
		//user1.showInfo();
	

	User[] uArray = new User[3];
	
	User user1 = new Customer("jws","j1234","정우성",1000);
	User user2 = new Customer("yjs","y2345","이효리",2000);
	User user3 = new Employee("master", "m7788", "운영자", 5000000 );
	
	
	uArray[0] = user1;
	uArray[1] = user2;
	uArray[2] = user3;
	     // 오버라이딩 
	for(int i =0; i<uArray.length; i++) {
		uArray[i].showInfo();
	}
	
	//Employee oo = new Employee();
	
	//System.out.println(oo.getSalary());
	
	
}
}