package day03;

public class CallByReferenceEx {
	
	
	
String str="";

public void setString(CallByReferenceEx ex){
	ex.str="박보검";
}

public static void main(String ar[]){
	CallByReferenceEx ex=new CallByReferenceEx();
	ex.str="이상훈";
	ex.setString(ex);
	System.out.println(ex.str);
}
}
