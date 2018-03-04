package day03;

public class ArrayRefTest {
	public static void main(String ar[]){
		
		
		Person persons[]=new Person[2]; // 0 ,1 두명
		
		Person p1=new Person();
		Person p2=new Person();
		
		persons[0]=p1; // 객체가 가르키는 주소를 던져줌
		persons[1]=p2;
		
		
		
		p1.age=20;
		p1.name="이상훈";
		p1.gender="male";
		
		
		p2.age=50;
		p2.name="박보검";
		p2.gender="male";
		
		
		
		
		System.out.println(persons[0].age);
		System.out.println(persons[0].name);
		System.out.println(persons[0].gender);
		
		System.out.println(persons[1].age);
		System.out.println(persons[1].age);
		System.out.println(persons[1].age);
		
	}
}
