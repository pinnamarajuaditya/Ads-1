import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
class AddLargeNumbers {
    
    public static LinkedList numberToDigits(String number) {
    	LinkedList<Character> list1=new LinkedList<>();
    	for(int i=0;i<number.length()-1;i++)
    	{
    		char c=number.charAt(i);
    		//list1.add(number.charAt(i));
    		list1.add(c);    	
    		
    	}
    	return list1;

    }

    public static String digitsToNumber(LinkedList list) {
    	LinkedList<String> list2=new LinkedList<>();
        
    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
    	Stack st1=new Stack();
    	Stack st2=new Stack();
    	LinkedList<Integer> result=new LinkedList<>();
    	int top=-1;
    	st1.push(list1);
    	st2.push(list2); 
    	while(top!=null)
    	{
    		
    		++top;
    		int d=st1.pop()+st2.pop();
    		result.add(d);
    		//result.add(st1.pop()+st2.pop());
    		
    	}
    	
    	
    	
    }
}

public class addlarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
    
}
