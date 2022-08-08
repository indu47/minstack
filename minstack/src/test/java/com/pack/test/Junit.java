package com.pack.test;
import static org.junit.Assert.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.pack.minstack.Main;

import static org.junit.Assert.assertEquals;  
import org.junit.Test;  


import static org.junit.Assert.*;

import java.util.EmptyStackException;

public class Junit {
	
	Main min = new Main();                                             
   	
	
	
	@Test	
	public void minstack() {
			
			 min.push(-2);
		    min.push(0);
			    min.push(-3);
			    min.push(10);
			          
			    
			   min.getMin();
			   assertEquals(-3,min.getMin());
				
			   min.pop();
			 
		      assertEquals(-3,min.top());
		
			    
			   min.getMin();
			    assertEquals(-3,min.getMin());
				
			   
			   
			   
			   
			  // @Test (expected = EmptyStackException.class)
				
				//public void EmptyException() {
					
					//min.push(2);
					//min.push(20);
					//min.pop();
					//min.pop();
					
					//min.getMin();
			   
	} 
}