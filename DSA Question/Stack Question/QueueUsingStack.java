import java.util.*;
class QueueUsingStack {

    static Stack<Integer> s1 = new Stack<Integer>(); 
    Stack<Integer> s2 = new Stack<Integer>(); 
    
    /*The method pop which return the element poped out of the stack*/
    int dequeue()
    {
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int res = s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return res;
        
	    // Your code here
    }
	
    /* The method push to push element into the stack */
   static  void enqueue(int x)
    {
        s1.push(x);
	    // Your code here	
    }
    public static void main(String[] args) 
    QueueUsingStack s = new QueueUsingStack();
       enqueue(2) ;
       enqueue(3);
       enqueue(1);
       s.dequeue();
    }
}

    
