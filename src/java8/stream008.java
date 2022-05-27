package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public
class stream008 {
    public static
    void main (String[] args) {
        ArrayList<String> l=new ArrayList<String> ();
        l.add ("aa");
        l.add ("xxx");
        l.add ("aaa");
        l.add ("pqrs");
        l.add ("aaaa");
        l.add ("aaaa");
        l.add ("a");
        l.add ("xx");
        l.add ("x");
        System.out.println (l);
        Comparator<String>c=(s1,s2)->{
           int  l1=s1.length ();
           int l2=s2.length ();
           if(l1<l2)return -1;
           else if (l1>l2) return +1;
          else {
               return s1.compareTo (s2) ;
           }
        };
        List<String> l1=l.stream ().sorted (c).collect(Collectors.toList());
        System.out.println ("Sorted list in increasing order of the length of string:  "+l1);
    }
}
