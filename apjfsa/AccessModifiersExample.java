package com.apjfsa;

// Class with different access modifiers
class MyClass {
   
	public int publicVar = 1;
    private int privateVar = 2;
    protected int protectedVar = 3;
    int defaultVar = 4;

    
    // Getter for privateVar
    public int getPrivateVar() {
        return privateVar;
    }

    // Setter for privateVar
    public void setPrivateVar(int privateVar) {
        this.privateVar = privateVar;
    
    }
}


// Another class accessing the variables
public class AccessModifiersExample {

    public static void main(String[] args) {

        MyClass obj = new MyClass();

        // Accessing public variable
        System.out.println(obj.publicVar); 

        // Accessing private variable via getter
        System.out.println(obj.getPrivateVar());

         // Accessing protected variable
        System.out.println(obj.protectedVar); 
      
        // Accessing default variable
        System.out.println(obj.defaultVar); 

        // Modifying private variable via setter
        obj.setPrivateVar(1000);
       
        // Accessing updated private variable
        System.out.println(obj.getPrivateVar()); 
   
    }
}
