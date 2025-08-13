
public class StringClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str1 = "Welcome to Java";
//		String str2= new String("Welcome to Java");
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str1.toUpperCase());
//		System.out.println(str1.toLowerCase());
//		System.out.println(str1.substring(4));
		String name1 = "Ravi";		// heap memory 
		String name2 = "Ravi";		// name1 and name2 refer to same memory. 
						// string pooling 
		String name3 = new String("Ravi");	// new memory 
		String name4 = new String("Ravi");	// new memory 
		// == check value as well as memory code ie hashCode 
		if(name1==name2) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
		System.out.println("----");
		// equals only check the value 
		if(name3.equals(name4)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
	}

}
