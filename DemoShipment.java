// Extend BoxWeight to include shipping costs.
// Start with Box.
class Box3 {
private double width;
private double height;
private double depth;
//construct clone of an object
Box3(Box3 ob) { // pass object to constructor
width = ob.width;
height = ob.height;
depth = ob.depth;
}
//constructor used when all dimensions specified
Box3(double w, double h, double d) {
width = w;
height = h;
depth = d;
}
//constructor used when no dimensions specified
Box3() {
width = -1; // use -1 to indicate
height = -1; // an uninitialized
depth = -1; // box
}
//constructor used when cube is created
Box3(double len) {
width = height = depth = len;
}
//compute and return volume
double volume() {
return width * height * depth;
}
}
//Add weight.
class BoxWeight3 extends Box3 {
double weight; // weight of box
//construct clone of an object
BoxWeight3(BoxWeight3 ob) { // pass object to constructor
super(ob);
weight = ob.weight;
}
//constructor when all parameters are specified
BoxWeight3(double w, double h, double d, double m) {
super(w, h, d); // call superclass constructor
weight = m;
}
//default constructor
BoxWeight3() {
super();
weight = -1;
}
//constructor used when cube is created
BoxWeight3(double len, double m) {
super(len);
weight = m;
}
}
//Add shipping costs.
class Shipment extends BoxWeight3 {
double cost;
//construct clone of an object
Shipment(Shipment ob) { // pass object to constructor
super(ob);
cost = ob.cost;
}
//constructor when all parameters are specified
Shipment(double w, double h, double d, double m, double c) {
super(w, h, d, m); // call superclass constructor
cost = c;
}
//default constructor
Shipment() {
super();
cost = -1;
}
//constructor used when cube is created
Shipment(double len, double m, double c) {
super(len, m);
cost = c;
}
}
class DemoShipment {
public static void main(String args[]) {
Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
double vol;
vol = shipment1.volume();
System.out.println("Volume of shipment1 is " + vol);
System.out.println("Weight of shipment1 is " + shipment1.weight);
System.out.println("Shipping cost: $" + shipment1.cost);
System.out.println();
vol = shipment2.volume();
System.out.println("Volume of shipment2 is " + vol);
System.out.println("Weight of shipment2 is " + shipment2.weight);
System.out.println("Shipping cost: $" + shipment2.cost);
}
}