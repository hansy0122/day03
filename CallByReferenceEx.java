package day03;

public class CallByReferenceEx {
	
	
	
String str="";

public void setString(CallByReferenceEx ex){
	ex.str="�ں���";
}

public static void main(String ar[]){
	CallByReferenceEx ex=new CallByReferenceEx();
	ex.str="�̻���";
	ex.setString(ex);
	System.out.println(ex.str);
}
}
