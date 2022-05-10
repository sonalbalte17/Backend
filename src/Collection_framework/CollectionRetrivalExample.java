package Collection_framework;

import java.util.*;

public
class CollectionRetrivalExample {
    public static
    void main (String[] args) {
        Set<String> set = new HashSet<String> ();
        set.add ("sonal");
        set.add ("anup");
        set.add ("vihi");
        System.out.println ("Set:::  " + set);
        for (String s : set) {
            System.out.println ("Set ,for each usage::::" + s);}

            //2nd Method using Iterator
            Iterator i = set.iterator ();
            //open declaration boolean java.util.Iterator.hasNext()
            while (i.hasNext ()) {
                System.out.println ("Iterator usage:::  " + i.next ());
            }
        List l=new ArrayList<> ();
            l.add ("xyz");
            l.add ("abc");
            l.add ("pqr");
            l.add ("mno");
        System.out.println (l);

        //Using Iterator interface for list
        ListIterator listIterator= l.listIterator ();
        while (listIterator.hasNext ()){
            //forward direction iteration
            System.out.println ("List Iterator in forward direction:   "+listIterator.next ());
            listIterator.remove ();
        }
        System.out.println (l);
        System.out.println ("************************************************");
        while (listIterator.hasPrevious ()){
            System.out.println ("List Iteration in backward direction:  "+listIterator.previous ());
        }
        }
    }
