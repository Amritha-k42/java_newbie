/* Here, Box uses a parameterized constructor to
initialize the dimensions of a box.
*/
class Box6 {
double width;
double height;
double depth;
// This is the constructor for Box.
Box6(double width, double height, double debth) {
this.width = width;
this.height = height;
this.depth = debth;
}
//copy constructor
Box6(Box6 b) {
this.width = b.width;
this.height = b.height;
this.depth = b.depth;
}

// compute and return volume
double volume() {
return this.width *this.height * this.depth;
}
}class BoxDemo7 {
	public static void main(String args[]) {
		// declare, allocate, and initialize Box objects
		Box6 mybox1 = new Box6(10, 20, 15);
		Box6 mybox2 = new Box6(3, 6, 9);
		Box6 mybox3 = new Box6(mybox1);
		double vol;
		// get volume of first box
		vol = mybox1.volume();
		System.out.println("Volume is " + vol);
		// get volume of second box
		vol = mybox2.volume();
		System.out.println("Volume is " + vol);
		vol = mybox3.volume();
		System.out.println("Volume is " + vol);
		}
		}