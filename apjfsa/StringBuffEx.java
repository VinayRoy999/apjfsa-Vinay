package com.apjfsa;

public class StringBuffEx {

	public static void main(String[] args) {
	
		StringBuffer strbuff = new StringBuffer("Anudip");
		
		strbuff.append("Foundation");
		
		System.out.println(strbuff);

		System.out.println(strbuff.reverse());
		
		System.out.println(strbuff.charAt(3));
		
		System.out.println(strbuff.indexOf("c"));
		
		System.out.println(strbuff.capacity());
		
		StringBuffer strb = new StringBuffer("Advance Program On Java FullStack Using Angular");

		System.out.println(strb.capacity());
		strb.deleteCharAt(8);
		System.out.println(strb);
        strb.codePointAt(1);
        System.out.println(strb.codePointAt(0));
        
        
        System.out.println(strb.compareTo(strbuff));
		
		
		
		
		
		
		
		
		//RevString
		String stt = "hello";
		StringBuffer strbf = new StringBuffer(stt);
		String Rev = strbf.reverse().toString();
		System.out.println(Rev);
		
		
	}

}
