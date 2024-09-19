/*              Date : 28/Aug/24    (start-end)
-------------------NOTES----------------------

-> Enumeration is only for legacy classes like as -> Vector & Stack
-> List v = new Vector(); -> vector is a legacy class so it's reference is not valid for enumeration. but valid for Iterator & ListIterator
 


 */


import java.util.List;
import java.util.Vector;
import java.util.*;

public class B_Enumeration {
    public static void main(String[] args) {
        
        // List v = new Vector();   // this is not valid bcz
        Vector v = new Vector();
        v.add(22);
        v.add("TGY");
        v.add(9.99);
        v.add(11);
        v.add(00000);
        v.add(22);
        v.add('Y');

        // System.out.println(v + "\n");
        int a = 0;

        System.out.println("-------------------------------\n\tEnumeration\n-------------------------------");
        Enumeration e = v.elements();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement() + "\tIndex => " + a);
            a++;
        }


        System.out.println("-------------------------------\n\tNext\n-------------------------------");

        a = 0;
        Iterator i = v.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next() + "\tIndex => " + a);
            a++;
        }

        System.out.println("-------------------------------\n\tPrevious\n-------------------------------");

        ListIterator li = v.listIterator();
        li.next();  // cursor iterate on next element
        li.next();  // cursor iterate on next element
        li.next();  // cursor iterate on next element
        li.next();  // cursor iterate on next element, Now cursor on 3
        while (li.hasPrevious()) {
            a = li.previousIndex();
            System.out.println(li.previous() + "\tIndex => " + a);
        }



    }
}
