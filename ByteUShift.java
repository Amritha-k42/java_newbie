// Unsigned shifting a byte value.
class ByteUShift {
static public void main(String args[]) {
char hex[] = {
'0', '1', '2', '3', '4', '5', '6', '7',
'8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
};
byte b = (byte) 0xf1;
System.out.println(b);
byte c = (byte) (b >> 4); //b=  0000000 11110001   00001111    11111111
//System.out.println(c);
byte d = (byte) (b >>> 4);
//System.out.println(d);
byte e = (byte) ((b & 0xff) >>> 4);
//System.out.println(e);
System.out.println(" b = 0x"
		+ hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
		System.out.println(" b >> 4 = 0x"
		+ hex[(c >> 4) & 0x0f] + hex[c & 0x0f]);
		System.out.println(" b >>> 4 = 0x"
		+ hex[(d >> 4) & 0x0f] + hex[d & 0x0f]);
		System.out.println("(b & 0xff) >> 4 = 0x"
		+ hex[(e >> 4) & 0x0f] + hex[e & 0x0f]);
		
		
		//int x =  -2147483647;
		//System.out.println(x);
		//int y = (x >>> 1);
		//System.out.println(y);
		}
		}