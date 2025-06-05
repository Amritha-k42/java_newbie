// Demonstrate when constructors are called.
// Create a super class.
class A4 {

}
//Create a subclass by extending class A.
class B4 extends A4 {
B4() {
	//super(1);
System.out.println("Inside B's constructor.");
}
}
//Create another subclass by extending B.
class C4 extends B4 {
	int a;
C4(int a) {
System.out.println("Inside C's constructor.");
}
}
class Test {
public static void main(String args[]) {
B4 b = new B4();
C4 c = new C4(1);
}
}