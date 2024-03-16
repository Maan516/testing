class Car{
	String Carname="BMW";
	int CarModelno=1;
	static String Carcompanyname="ABC";
		 void meth() {
			 System.out.println(Carname);
			 System.out.println(CarModelno);

		}
		 static void meth1() {
			System.out.println(Carcompanyname);

		}
}
public class Example {
public static void main(String[] args) {
	Car ob = new Car();
	ob.meth();
	Car.meth1();
	System.out.println(ob.Carname);
	System.out.println(ob.CarModelno);
	System.out.println(Car.Carcompanyname);
	System.out.println("Static and Non-Static");
}
}
