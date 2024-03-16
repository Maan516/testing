class Employee{
	String name;
	int id;
	float sal;
	String address;
	public Employee(String name, int id, float sal, String address) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [" + (name != null ? "name=" + name + ", " : "") + "id=" + id + ", sal=" + sal + ", "
				+ (address != null ? "address=" + address : "") + "]";
	}	
	
	
}

public class Main {
public static void main(String[] args) {
	Employee ob = new Employee("Maan",1,12555,"Vasai");
	Employee ob1 = new Employee("Yuvraj",2,5000000,"Mumbai");
	System.out.println(ob);
	System.out.println(ob1);

}
}
