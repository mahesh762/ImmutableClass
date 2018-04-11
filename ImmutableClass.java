package com.mypackage;

public final class ImmutableClass {
	
	 private final String[] array;
	
	
	 public ImmutableClass(String[] arr){
		this.array=arr.clone();
			 
	     }
	 public String toString() {
	 StringBuffer sb = new StringBuffer("Characters in array are: ");
	 for (int i = 0; i < array.length; i++) {
	 sb.append(array[i] + " ");
		 
	 }
     return sb.toString();
		
	 }
	 public static void main(String[] args) {
		 
		String[] a = { "a", "b" };

		ImmutableClass ic = new ImmutableClass(a);

		System.out.println("Before constructing " + ic);

		a[1] = "c"; 

		System.out.println("After constructing " + ic);

	}
	

}
