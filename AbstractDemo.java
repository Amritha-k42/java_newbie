// A Simple demonstration of abstract.
abstract class A3 {
abstract void callme();
// concrete methods are still allowed in abstract classes
void callmetoo() {
System.out.println("This is a concrete method.");
}
}
class B3 extends A3 {
void callme() {
System.out.println("B's implementation of callme.");
}
}
class AbstractDemo {
public static void main(String args[]) {
//A3 a=new A3();
B3 b = new B3();
b.callme();
b.callmetoo();

}
}