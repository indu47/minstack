package com.pack.minstack;

import java.util.Stack;

 public class Main {
	
	   Stack<Integer> stack;
	   Stack<Integer> minstack;
	   
	   public Main()
	   {
		   stack=new Stack<Integer>();
		   minstack=new Stack<Integer>();
	   }
	   public void push(int x) {
		   int minn=x;
		   
		   if(!minstack.isEmpty() && minn>minstack.peek())
		   {
			   minn=minstack.peek();
		   }
		   stack.push(x);
		   minstack.push(minn);
			   }
     public void pop()
              {
            	  minstack.pop();
            	  stack.pop();
                   }
              public int top()
              {
            	  return stack.peek();
              }
              public int getMin()
              {
            	  return minstack.peek();
              }   
            	    
            	public static void main(String[] args) {
            		
            		Stack<Integer> stack=new Stack<Integer>();
            		stack.push(null);
            		stack.push(null);
            		stack.push(null);
            		stack.push(null);
            		stack.push(-3);
            		stack.push(null);
            		stack.push(0);
            		stack.push(-2);
            		
            		System.out.println(stack);
            	   
            	}
            	}
              
              
              
              
              
              
              
              
              
              
           