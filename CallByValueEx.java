package day03;

public class CallByValueEx {
	
	
	
	
	
		public void setString(String str){ // ������ ��.
		str="�ں���";
		}
	
	
		public static void main(String ar[]){
			
			CallByValueEx ex=new CallByValueEx();
			String str="�̻���";
			ex.setString(str);
			System.out.println(str); // �̻����� ����
			
			
			String str1="�̻���";
			String str2="�ں���";
			String p[]=new String[2];
			p[0]=str1;
			p[1]=str2;
			System.out.println(str1.hashCode());
			
			System.out.println(p[0]);
			System.out.println(p[1]);
			
			
			str1="�̻���1";
			str2="�̻���1";
			
			System.out.println(str1.hashCode());
			System.out.println(str2.hashCode());
			System.out.println(p[0]);
			System.out.println(p[1]);
			
			
			
			
		}

}
