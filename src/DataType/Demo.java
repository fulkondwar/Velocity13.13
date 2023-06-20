package DataType;

public class Demo {
	public static void main(String []args) {
		
 //Data type are used to represent the types of data
	//	1. Primitive Datatype
		/* Memory size are fixed
		 * All primitive data type are keywords
		 * They start with lower case
		 * 
		 * 1. Byte     - 1 byte
		 * 2. Short    - 2 byte
		 * 3. int      - 4 byte
		 * 4. long	   - 8 byte
		 * 5. float    - 4 byte
		 * 6. double   - 8 byte
		 * 7. boolean  - 1 bit
		 * 8. char     - 2 byte 
		 */
		
	/* 2. NonPrimitive Datatype = 1. Memory size are not fixed.
	 *                            2. All they are identifier.
	 *                            3. Start with upper case
	 *                            4. Classname, Array, String
	 */
	
		short s1=130;
		System.out.println(s1);
		
		short s2=32767; // Max limit
		System.out.println(s2);
		
		//int 4 byte=32 bit
		
		int i1=120;
		int i2=32768;
		
		System.out.println(i1);
		System.out.println(i2);
		
		// long 8 byte = 64 bit
		
		long l1=4613;
		long l2=895623489;
		
		System.out.println(l1);
		System.out.println(l2);
		
		// char 2 byte = 16 bit
		
		char c1='A';
		char c2='#';
		char c3='/';
        char c4='?';
        
        System.out.println(c1);
        System.out.println(c4);
        
        // boolean = 1 bit
        
        boolean b1=true;
        boolean b2=false;
        
        System.out.println(b1);
        System.out.println(b2);
        
		
		
	}

}
