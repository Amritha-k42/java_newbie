// Demonstrate casts.
class Conversion {
public static void main(String args[]) {
byte b; char c='A'; int z;
z=c;
System.out.println("z="+z);
int i = 257;
double d = 257.142;
System.out.println("\nConversion of int to byte.");
b = (byte) i;
System.out.println("i and b " + i + " " + b);
System.out.println("\nConversion of double to int.");
i = (int) d;
System.out.println("d and i " + d + " " + i);
System.out.println("\nConversion of double to byte.");
b = (byte) d;
System.out.println("d and b " + d + " " + b);
}
}