
public class a extends D{
	public a() {
		this(123);
		System.out.println("Default");
	}
	public a(int id) {
		this (34.78f);
			System.out.println("Integer constructor=>"+id);
		}
	public a (float id) {
		this("Ela");
		System.out.println("Float constructor=>"+id);
	}
	public a(String name) {
		super("Thendral");
		System.out.println("String constructor=>"+name);
	}
	
public static void main(String[] args) {
	a a = new a();
}
}
