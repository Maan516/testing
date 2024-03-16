class A{
	 void meth(int a) {
		System.out.println("Square of a "+a*a);

	}
	 
}
class B extends A{
	@Override
	void meth(int a) {
		System.out.println("Cube of A "+a*a*a);
	}
}
public class TestOverriding {
public static void main(String[] args) {
	A ob = new A();
	ob.meth(2);
	B ob1 = new B();
	ob1.meth(2);
	
	System.out.println("Example of Method Overriding");
}
}
