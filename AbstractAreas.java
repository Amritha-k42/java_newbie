// Using abstract methods and classes.
abstract class Figure1 {
double dim1;
double dim2;
Figure1(double a, double b) {
dim1 = a;
dim2 = b;
}
// area is now an abstract method
abstract double area1();
}
class Rectangle1 extends Figure1 {
Rectangle1(double a, double b) {
super(a, b);
}
// override area for rectangle
double area1() {
System.out.println("Inside Area for Rectangle.");
return dim1 * dim2;
}
}
class Triangle1 extends Figure1 {
Triangle1(double a, double b) {
super(a, b);
}
// override area for right triangle
double area1() {
System.out.println("Inside Area for Triangle.");
return dim1 * dim2 / 2;
}
}
class AbstractAreas {
public static void main(String args[]) {
//Figure1 f = new Figure1(10, 10); // illegal now
Rectangle1 r = new Rectangle1(9, 5);
Triangle1 t = new Triangle1(10, 8);
Figure1 figref; // this is OK, no object is created
figref = r;
System.out.println( "Area is " );
System.out.println( figref.area1());
figref = t;
System.out.println("Area is " + figref.area1());
}
}