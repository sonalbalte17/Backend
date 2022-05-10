package Collection_framework;

import java.util.ArrayList;
import java.util.Iterator;

public
class Iterator_Demo {
    public static
    void main (String[] args) {
        ArrayList l = new ArrayList ();
        for (int i = 0; i <= 10; i++) {
            l.add (i);
        }
        System.out.println (l);
        Iterator itr = l.iterator ();
        while (itr.hasNext ()) {
            Integer n = (Integer) itr.next ();
            if (n % 2 == 0)//even no.s will be printed one by one
                System.out.println (n);
            else
                itr.remove (); //odd no.s will be removed
        }
System.out.println (l);
    }
}