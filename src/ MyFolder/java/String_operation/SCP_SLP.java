package String_operation;

public class SCP_SLP {

	public static void main(String[] args) {
		//String Constant Pool or String Literal Pool
		//Whenever we create an object using the new keyword,the object gets a memory allocation in the heap area
		//There are 5 memory areas in java: 1.Method area 2.heap area[SCP/SLP]where in u can manipuliate the size, 
		//3.Stack Area 4. PC register 5.Native Method Area
		
		String S1=new String();//only 1 obj is created here, Object is stored in heap area
		String s2=new String("Selenium");//1st object is stored in heap area
		                                 //2nd object is stored in SCP/SLP area
		
		//*we cant delete the objects created inside the SCP/SLP area by the concept of garbage collector

		String S3="Python"; // one object will be created directly in the SCP?SLP area
		String S4=new String("java");// 2 obj will be created
		String S5=new String("Perl");// 2 obj will be created
		String S6=new String("java");// 1 object will be created
		String S7="DotNet";
		String S8="java";//No obj will be created
		
	}

}
