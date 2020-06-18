package com.dxc.string;

// StringBuffer Class is used to create mutuable (modifiable) String i.e it can be changed.

public class StringBufferClass {

	public static void main(String[] args) {
		
		// append Method concatenates the given values with string
//			StringBuffer sb = new StringBuffer("rohan,");
//			sb.append("ram,");
//			sb.append("sham,");
//			sb.append("radha");
//			System.out.println(sb);
			
			// Splitting the String
			/*String completeString = sb.toString();
			System.out.println(completeString);
			
			String arry[] = completeString.split(",");
			for(String str: arry)
				System.out.println(str);*/
			
		
		// insert in StringBuffer
//			StringBuffer sb = new StringBuffer("DXC Technologies, Indore");
//			sb.insert(1, "Developers");
//			System.out.println(sb);
			
		// replace in StringBuffer
//			StringBuffer sb = new StringBuffer("Rohan");
//			sb.replace(1, 3, "Developer");
//			System.out.println(sb);
		
		// delete in StringBuffer
//			StringBuffer sb = new StringBuffer("Rohan");
//			sb.delete(1, 3);
//			System.out.println(sb);
		
		// reverse in StringBuffer
//			StringBuffer sb = new StringBuffer("Rohan");
//			sb.reverse();
//			System.out.println(sb);
		
		// Capacity in StringBuffer
			StringBuffer sb = new StringBuffer();
			System.out.println(sb.capacity());
			sb.append("Rohan");
			System.out.println(sb.capacity());
			sb.append("Rohan is a very good boy he is sincere and puntucal in every task assigned to him");
			System.out.println(sb.capacity());
		
		
	}

}
