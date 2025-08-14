
public class StringBufferAndStringBuilderExample {

	public static void main(String[] args) {
		String str = "Raj";
		System.out.println(str);
			System.out.println(str.toUpperCase());
		System.out.println(str);
		
		StringBuffer sb = new StringBuffer("Raj");
		System.out.println(sb);
		System.out.println(sb.append(" Deep"));
		
		System.out.println(sb);
	}

}
