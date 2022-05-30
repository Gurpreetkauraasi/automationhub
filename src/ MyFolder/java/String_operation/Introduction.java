package String_operation;

public class Introduction {

	public static void main(String[] args) {
		//1.String is a non primitive data type
		//2.string size is not fixed
		//3.it is also a sequence of characters
		//4.it is also called Array of characters
		
		char arr[]= {'1','2','3','4','5','6','7','8','9'};
		String S1=new String(arr);
		System.out.println(S1);
		
		char arr1[]= {'!','@','#','$','^','&','*','%','9'};
		String S2=new String(arr1);
		System.out.println(S2);
		
		//5.String also acts as a class. String has a lot of methods too
		
		String S3=new String();
		
		//6. String is also a immutable object
		
		String S4="Honey";
		S4="Gopi";
		
		//7.Multiple ways to create String objects
		
		String S5=new String("HelloWorld");
		StringBuffer S6=new StringBuffer();
		StringBuilder S7=new StringBuilder();
		//StringBuffer S8="hlo";
		//StringBuilder S9="world";
		
	}
}
