// Primitive types are passed by value.
class Test1 {
void meth(int i, int j) {
i *= 2;  // i=i*2   =30
j /= 2;   //j=j/2   =10
}
}
class CallByValue {
public static void main(String args[]) {
Test1 ob = new Test1();
int a = 15, b = 20;
System.out.println("a and b before call: " +
a + " " + b);
ob.meth(a, b);
System.out.println("a and b after call: " +
a + " " + b);
}
}