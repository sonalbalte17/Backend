package Collection_framework;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.RandomAccess;

public
class Arraylist_Serializable {
    public static
    void main (String[] args) {
        ArrayList l1=new ArrayList ();
        LinkedList l2=new LinkedList ();
        //boolean values true or false will be printed
        System.out.println (l1 instanceof Serializable);
        System.out.println (l2 instanceof Serializable);
        System.out.println (l1 instanceof Cloneable);
        System.out.println (l2 instanceof Cloneable);
        System.out.println (l1 instanceof RandomAccess);
        System.out.println (l2 instanceof RandomAccess);

    }
}
