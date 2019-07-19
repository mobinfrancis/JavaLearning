package OOPConcept1;

public class CallByValAndReference {
	int p ;
	int q;

	public static void main(String[] args) {
		int x =20;
		int y = 300;
		CallByValAndReference obj = new CallByValAndReference();
		obj.testsum(x, y); // Call by Value 
		obj.p=1000;
		obj.q=2000;
		obj.swap(obj); 
		System.out.println(obj.p);
		System.out.println(obj.q);
	}
public int testsum(int a , int b )
{
	//a= 10;
	//b =20;
	int c=a+b;
	System.out.println(c);
	return c;
	
}
public void swap(CallByValAndReference t) {
	int temp;
	temp=t.p;//1000
	t.p=t.q;//2000
	t.q=temp;//1000
	//System.out.println(t.p);
	//System.out.println(t.q);
	
}
}
