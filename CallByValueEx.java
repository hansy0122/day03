package day03;

public class CallByValueEx {
	
	
	
	
	
		public void setString(String str){ // 값으로 들어감.
		str="박보검";
		}
	
	
		public static void main(String ar[]){
			
			CallByValueEx ex=new CallByValueEx();
			String str="이상훈";
			ex.setString(str);
			System.out.println(str); // 이상훈이 나옴
			
			
			String str1="이상훈";
			String str2="박보검";
			String p[]=new String[2];
			p[0]=str1;
			p[1]=str2;
			System.out.println(str1.hashCode());
			
			System.out.println(p[0]);
			System.out.println(p[1]);
			
			
			str1="이상훈1";
			str2="이상훈1";
			
			System.out.println(str1.hashCode());
			System.out.println(str2.hashCode());
			System.out.println(p[0]);
			System.out.println(p[1]);
			
			
			
			
		}

}
