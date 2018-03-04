package day03;

public class VarArgsEx {
	
	
	//가변인자 //비추  단 다른거를 받을때는 앞에다가 받아야함 !!
	public void print(int a,String ...strs){
		for(String str:strs){
			System.out.println(str);
		}
	}
	
	public static void main(String ar[]){
		VarArgsEx ex=new VarArgsEx();
		ex.print(10,"박보검","류준열","김낭성");
		
	}
}
