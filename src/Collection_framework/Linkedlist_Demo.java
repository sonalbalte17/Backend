
package Collection_framework;
import java.util.*;
public
class Linkedlist_Demo {
    public static
    void main (String[] args) {
LinkedList l1=new LinkedList ();
l1.add ("sona");
l1.add ("A");
l1.add ("java");
l1.add (null);
l1.add (3);
        System.out.println (l1);

l1.set (1,"An");
        System.out.println (l1);

l1.add (1,"Anup");
l1.addLast ("Vihi");
l1.addFirst ("Learning");
l1.remove ("b");
System.out.println (l1);
    }
}
