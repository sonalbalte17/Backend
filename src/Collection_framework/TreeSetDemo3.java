package Collection_framework;

import java.util.Comparator;
import java.util.TreeSet;

public
class TreeSetDemo3 {
    public static
    void main (String[] args) {
        //if we are not passing MyComparator() object at line 11,then jvm will call compareTo () method
        // which will sort by default natural sorting order.The output is ascending order.[0, 5, 10, 15, 20]
        //by passing Mycomparator() obj we achieve customized sorting.output is descending order.

        TreeSet t =new TreeSet (new MyComparator());
        t.add(10);
        //compare(0,10)--->pos
        t.add(0);
        //compare(15,10)---->neg
        t.add(15);
        //compare(5,10) pos & (5,0) neg
        t.add(5);
        // compare(20,10) neg & compare(20,15) neg
        t.add(20);
        // compare (20,10) neg & compare(20,15) neg & compare(20,20) 0(zero)
        t.add(20);
        System.out.println (t);
    }
}
class MyComparator implements Comparator{

    @Override
    public
    int compare (Object obj1, Object obj2)
    {
        Integer I1=(Integer)obj1;
        Integer I2= (Integer) obj2;
        if(I1<I2)//descending order sorting
            return +1;
        else if (I1>I2)
            return -1;
        else 
        return 0;
    }
}