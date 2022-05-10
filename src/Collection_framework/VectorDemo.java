package Collection_framework;

import java.util.Vector;

public
class VectorDemo {
    public static
    void main (String[] args) {
        Vector v=new Vector (); //vector constructor type 1 with initial capacity 10
        v = new Vector (15);// vector constructor type 2 with initial capacity 15
        v=new Vector (12,2);//vector constructor 3 with initial capacity 10 n incremental capacity 15
        System.out.println (v.capacity ());
        for (int i = 0;i<10;i++)
        {
    v.addElement (i);
        }
        System.out.println (v.capacity ());
        v.addElement ("s");
        System.out.println (v.capacity ());
        System.out.println (v);
        System.out.println ("*********************************");

    }
}
