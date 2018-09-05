package plactice;

public class Outer {
	String outerName = "outer";

	public static void main(String[]args) {
		Outer outer = new Outer();
		Inner inner = outer.new Inner();
		inner.outerAccess();
		System.out.println(outer.outerName);
	}
	public class Inner{
		void outerAccess() {
			System.out.println(outerName);
		}
	}
}
