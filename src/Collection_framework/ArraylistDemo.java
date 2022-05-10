package Collection_framework;

import javax.print.attribute.SetOfIntegerSyntax;
import java.util.*;

public
class ArraylistDemo {
    public static
    void main (String[] args) {
        ArrayList I= new ArrayList ();
        I.add ("S");
        I.add (3);
        I.add ("Sonal");
        I.add ("S");
        I.add (null);
        System.out.println (I);
        I.remove (2);
        System.out.println (I);
        I.add (2,"S");
        System.out.println (I);
        I.add ("Anup");
        System.out.println (I);
        //I.contains ("s");
       // System.out.println (I);
       // I.clone ();
       // System.out.println (I);
        I.add (1,"V");
        System.out.println (I);

        System.out.println (I.get (0));//get the object at the specified index location
        System.out.println (I.lastIndexOf ("S"));//last occurrence of the object in the list
        System.out.println (I.indexOf ("S"));// first occurrence of the object in the list
       I.set (0,"vihi");// set is used to replace the object at the particular index value.
       System.out.println (I);
        ListIterator listIterator;
        System.out.println (I);




    }
}
