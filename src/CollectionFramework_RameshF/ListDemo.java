package CollectionFramework_RameshF;

import java.util.ArrayList;
import java.util.List;

public
class ListDemo {
    public static
    void main (String[] args) {
        List l=new ArrayList ();
        //adding duplicate elements
        l.add ("sonal");
        l.add ("anup");l.add ("vihi");
        l.add ("kaushu");
        l.add ("sonal");
        System.out.println (l);
//insertion order is preserved
        l.add ("e1");
        l.add ("e2");
        l.add ("e3");
        l.add (null);
        System.out.println (l);
        //access eelments from the list
System.out.println (l.get (3));
        System.out.println (l.get (5));
    }
}
