abstract class E
{
	void meth1()
	{
		System.out.println("Non-static Method");
	}
	static void meth2()
	{
		System.out.println("Static method");
	}
	abstract void meth3();
}
class F extends E{

	@Override
	void meth3() {
		System.out.println("Abstract Method");
		
	}
	
}
public class Testabstract {
public static void main(String[] args) {
	F ob = new F();
	ob.meth3();
	ob.meth1();
	F.meth2();
	System.out.println("Example of Abstrat");
}
}
