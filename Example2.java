/* Here is another short example.
	Call this file “Example2.java” */

class SwapNum {
	int Num1, Num2;

	SwapNum(int x, int y) {
		
		Num1 = x;
		Num2 = y;
	}

       void swap(SwapNum x)
         {
int temp = x.Num1;
		x.Num1 = x.Num2;
		x.Num2 = temp;

         }

	void display(SwapNum x) {
		System.out.println("swapped values are " + x.Num1 + " " + x.Num2);
	}
}
public class Example2 {
	public static void main(String args[]) {
		SwapNum obj = new SwapNum (10, 20);
        obj.swap(obj);
		obj.display(obj);
		}
	
}

