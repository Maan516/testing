interface G{
	void meth();
}
class J implements G{

	@Override
	public void meth() {
		System.out.println("Interface Class");		
	}
	
}
public class TestInterface {
public static void main(String[] args) {
	J obj = new J();
	obj.meth();
	System.out.println("Example of Interface");
}
}
