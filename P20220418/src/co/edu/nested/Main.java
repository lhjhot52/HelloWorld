package co.edu.nested;


public class Main {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.method1();
		
		// instance 멤버클래스.
		Outer.Inner1 inner = outer.new Inner1();
		inner.method2();
		
		// static 멤버클래스.
		Outer.Inner2.method5();
		// instance vs. static
		Outer.Inner2 inner2 = new Outer.Inner2(); //outer.new Inner();
		inner2.method4();
		inner2.method5();

//		inner.method2();
	
	}
}
