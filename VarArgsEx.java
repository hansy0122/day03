package day03;

public class VarArgsEx {
	
	
	//�������� //����  �� �ٸ��Ÿ� �������� �տ��ٰ� �޾ƾ��� !!
	public void print(int a,String ...strs){
		for(String str:strs){
			System.out.println(str);
		}
	}
	
	public static void main(String ar[]){
		VarArgsEx ex=new VarArgsEx();
		ex.print(10,"�ں���","���ؿ�","�賶��");
		
	}
}
