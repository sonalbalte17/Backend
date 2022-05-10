package Collection_framework;

import java.util.LinkedList;
import java.util.ListIterator;

public
class ListIterator_demo {
    public static
    void main (String[] args) {
        LinkedList l = new LinkedList ();
        l.add ("Sonal");
        l.add ("Anup");
        l.add ("Vihi");
        l.add ("ABC");
        System.out.println (l);
        //creation of listIterator to fetch the objects one by one
        ListIterator ltr = l.listIterator ();
        while (ltr.hasNext ()) {
            String s = (String) ltr.next ();
            if (s.equals ("Sonal")) {
                ltr.remove ();
            } else if (s.equals ("Anup")) {
                ltr.add ("An");
            } else if (s.equals ("Vihi")) {
                ltr.set ("Vihaan");
            }
        }
        System.out.println (l);
    }
}
