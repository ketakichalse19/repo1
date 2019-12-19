package sample01;

public class RiderTest {
	public static void main(String[] args) {
		knightRider rider  = new knightRider();
		A a = new A();
		rider.m1(a);
		
		B b = new B();
		rider.m1(b);
		
		C c = new C();
		rider.m1(c);
		
		B b1 = new C();
		rider.m1(b1);
	}

}
