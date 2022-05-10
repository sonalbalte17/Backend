package CollectionFramework_RameshF;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public
class CollectionDemo {
    public static
    void main (String[] args) {
        Collection fruitcl=new ArrayList ();
        fruitcl.add ("apple");
        fruitcl.add("mango");
        fruitcl.add ("grapes");
        System.out.println (fruitcl);
        fruitcl.remove ("grapes");
        System.out.println (fruitcl);
        System.out.println (fruitcl.contains ("apple"));
        System.out.println (fruitcl.isEmpty ());
     Iterator itr = fruitcl.iterator ();
     while(itr.hasNext ()) System.out.println ("iterator of elements" + itr.next ());
        fruitcl.forEach ((element)->System.out.println (element));
        fruitcl.clear ();
        System.out.println (fruitcl);
    }
}
