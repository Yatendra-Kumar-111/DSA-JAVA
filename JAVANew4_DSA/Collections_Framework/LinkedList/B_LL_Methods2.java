/*              Start_Date : 11-09-2024      To     End_Date : 12-09-24  
                    Thank You :)

                    
Shortcuts -> { (LL-LinkedList) , (obj-object) , (objs-objects) }

        ______________________________
        IMPORTANT POINTS
        ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯
         
        

-------------------------------NOTES-----------------------------
-> element() method - is only for retrieve head of Linkedlist.
-> () 






-> poll() method - it is like as counter variable means it iterate from First position of list then it increases.

-> pollFirst() method - it iterate from First position of list then it increases.

-> pollLast() - it iterate from last position of list then it decreases.

-> push() method - it add element at first postion. &  parameter complusory & no return type

-> pop() method - it remove element at first postion & no parameter required  & return removed element 




*/

package Collections_Framework.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class B_LL_Methods2 {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add("hello");
        list.add("TGY");
        list.add("How");
        list.add("are");
        list.add("you?");





// /* 

// */


//  6----------Use of push() & pop() method---------------

        System.out.println("\t:::Before Use of push() method:::" );
        System.out.println(list);

        list.push("Best");

        System.out.println("\t:::After Use of push() method:::" );
        System.out.println(list);

        
        System.out.println("\n\t:::Before Use of pop() method:::" );
        System.out.println(list);

        list.pop();

        System.out.println("\t:::After Use of pop() method:::" );
        System.out.println(list);




// 5---------------Use of poll() & pollFirst() & pollLast() method---------------
        // System.out.println("List -> " + list);

// it iterate from First position then increases
        // System.out.println("Use of poll() method -> " + list.poll()); 
        // System.out.println("Use of poll() method -> " + list.poll()); 
        
// it iterate from First position then increases
        // System.out.println("Use of pollFirst() method -> " + list.pollFirst()); 
        // System.out.println("Use of pollFirst() method -> " + list.pollFirst()); 

// it iterate from last position then decreases
        // System.out.println("Use of pollLast() method -> " + list.pollLast()); 
        // System.out.println("Use of pollLast() method -> " + list.pollLast()); 






//  4---------Use of peek() & peekLast() & peekFirst() method
        // System.out.println("List -> " + list);
        // System.out.println("Use of peek() method -> " + list.peek());
        // System.out.println("Use of peekFirst() method -> " + list.peekFirst());
        // System.out.println("Use of peekLast() method -> " + list.peekLast());




//  3-------Use of offer() & offerFist() & offerLast() method-------

        // list.offer("addLast");
        // System.out.println("Add new element at Last Position -> " + list);
        // list.offerFirst("addFirst");
        // System.out.println("Add new element at First Position -> " + list);
        // list.offerLast("AddEndOFList");
        // System.out.println("Add new element at End Position -> " + list);




//  2-----------Use of element() & getFirst() & getLast() method-----------
        // LinkedList list = new LinkedList();
        // list.add("hello");
        // list.add("TGY");
        // list.add("TGY");
        // list.add("hi");
        // list.add("Bye");

        // System.out.println("Element -> " + list.element());
        // System.out.println("Get First -> " + list.getFirst());
        // System.out.println("Get Last -> " + list.getLast());



//  1----------------Use of clone() method----------------
/* 
        LinkedList list = new LinkedList();
        list.add("hello");
        list.add("TGY");
        list.add("TGY");
        list.add("hi");
        list.add("Bye");
        LinkedList list2 = (LinkedList)list.clone();

        System.out.println("List 1 => " + list);
        System.out.println("List 2 => " + list2);

        list.add("good");

        System.out.println("List 1 => " + list);
        System.out.println("List 2 => " + list2);

        // ArrayList al = new ArrayList();
        // al.add("11");
        // al.add("11");
        // al.add("11");
        // LinkedList list3 = (LinkedList)al.clone();
*/

    }

}
