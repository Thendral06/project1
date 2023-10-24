
public class S {
	public S() {
		System.out.println("Default constructor");
	}
	public S(String name) {
		System.out.println("String constructor="+name);
	}

	public static void main(String[] args) {
		S s =new S();
		S s1 = new S("Elamapruthi");
	
}}
