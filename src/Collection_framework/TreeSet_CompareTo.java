package Collection_framework;

public
class TreeSet_CompareTo {
    public static
    void main (String[] args) {
        System.out.println ("a".compareTo ("z"));//if obj1 comes before obj2,returns -ve int val
        System.out.println ("z".compareTo ("b"));//if obj1 comes after obj2,returns +ve int val
        System.out.println ("a".compareTo ("a"));// if obj1 equals obj2,returns Zero

        System.out.println ("a".compareTo (null));//null pointer exceptionkk k


    }
}
