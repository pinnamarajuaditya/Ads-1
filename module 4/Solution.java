package com.xyz;
import java.util.Scanner;
import java.util.Stack; 

public class Solution  
{ 
    
    static int evaluatePostfix(String exp) 
    { 
        
        Stack<Integer> stack=new Stack<Integer>(); 
          
        
        for(int i=0;i<exp.length();i++) 
        { 
            char c=exp.charAt(i); 
            if(Character.isDigit(c)) 
            stack.push(c - '0');
            else
            { 
                int val1 = stack.pop(); 
                int val2 = stack.pop(); 
                  
                switch(c) 
                { 
                    case '+': 
                    stack.push(val2+val1); 
                    break; 
                      
                    case '-': 
                    stack.push(val2- val1); 
                    break; 
                      
                    case '/': 
                    stack.push(val2/val1); 
                    break; 
                      
                    case '*': 
                    stack.push(val2*val1); 
                    break; 
              } 
            } 
        } 
        return stack.pop();     
    } 
      
    public static void main(String[] args)  
    { 
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the string");
        String exp=sc.next(); 
        System.out.println(evaluatePostfix(exp)); 
    } 
} 
