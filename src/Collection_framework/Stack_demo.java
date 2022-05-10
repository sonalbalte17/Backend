package Collection_framework;

import java.util.Stack;

public
class Stack_demo {
    public static
    void main (String[] args) {
        Stack s=new Stack ();
        s.push ("String");//adding element to the stack
        s.push ("A");
        s.push (null);
        s.push (31);

        System.out.println (s);
       s.peek ();//looks at the object at the top of the stack wout removing it
        System.out.println (s.peek ());
     s.pop ();//removes the object at the top of the stack and returns that object as the value of that function
        System.out.println (s.pop ());
        System.out.println (s);

        System.out.println (s.search ("String")); //returns the offset value starting from the top
        System.out.println (s.search ("B"));//element is not available in the stack so returns -1

    }
}
