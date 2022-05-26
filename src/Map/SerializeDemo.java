package Map;

import java.io.*;

class Dog implements Serializable{
  transient int i=10;
    transient final int  j=20;
}
public
class SerializeDemo {
    public static
    void main (String[] args) throws IOException, ClassNotFoundException {
        Dog d1=new Dog ();
        //Serialization lines 18 to 20
        FileOutputStream fos=new FileOutputStream ("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream (fos);
        oos.writeObject (d1);
        /* DeSerialization lines 19 to 21 */
        FileInputStream fis=new FileInputStream ("abc.ser");
        ObjectInputStream ois=new ObjectInputStream (fis);
        Dog d2= (Dog) ois.readObject ();//Typecasting to dog object
        System.out.println (d2.i+"----"+ d2.j);

        //declaration--------------------------------------------------------------output
        //1) int i=10; int j=20;                                                    10----20
        //2) transient int i=10;,int j=20;                                          0----20
        //3) transient static int i=10;transient int j=20;                          10----0
        //4) transient int i=10; transient final int j=20;                          0----20
        //5) transient static int i=10;transient static int j=20;                   10----20

    }
}
