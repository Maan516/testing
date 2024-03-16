class Phone
{
	void voicecall(int no)
	{
		System.out.println("Voice Call "+no);
	}
	void vediocall(int no, int n)
	{
		System.out.println(" Press 2 For Vedio Call "+no+","+n);
	}
}
public class TestOver {
public static void main(String[] args) {
	Phone ob = new Phone();
	ob.voicecall(123456789);
	ob.vediocall(12335456,2);
	
}
}
