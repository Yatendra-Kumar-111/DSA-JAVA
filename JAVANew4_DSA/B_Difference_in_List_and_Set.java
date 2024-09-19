//              Date : 28/Aug/24    (start-end)



import java.util.*;


public class B_Difference_in_List_and_Set {
    public static void main(String[] args) {




//  Difference b/w iterator & listIterator 
// /*
    // .....................listIterator.....................
        List li = new ArrayList();
        li.add(11);
        li.add(22);
        li.add(null);
        li.add(99);
        li.add(44);
        System.out.println(li + "\n");

        ListIterator litr = li.listIterator();

        
        // System.out.println("-----------------Forward Direction------------------");
        // while(litr.hasNext())   // Forward Direction
        // {
        //     System.out.println(litr.next());
        // }

        // System.out.println("-----------------Backward Direction------------------");
        // while(litr.hasPrevious())   // Backward Direction
        // {
        //     System.out.println(litr.previous());
        // }


    // cursor moves 
        System.out.println(litr.next());
        System.out.println(litr.next());
        System.out.println(litr.next());
        System.out.println(litr.next());
        System.out.println(litr.next());    // cursor b/w index 4 & 5
        // System.out.println(litr.next()); // Exception occur bcz no element is present on next cursor
        litr.set(112233);
        System.out.println("Set : " + li);
       

        System.out.println( "\nPrevious index : " + litr.previousIndex());  // it return 4
        System.out.println(litr.previous());    // cursor b/w index 3 & 4
        System.out.println(litr.previous());    // cursor b/w index 2 & 3
        System.out.println(litr.previous());    // cursor b/w index 1 & 2
        System.out.println( "\nPrevious index : " + litr.previousIndex());

        System.out.println("Without Set : " + li);
        litr.set(112233);
        System.out.println("Set : " + li);
      
        litr.add(12340);    // cursor b/w index 1 & 2. So, element add after 1 index. means add() method can add element on last position.
        
        System.out.println(li);
        
         

// */




    // .....................iterator.....................
    /* 
        List l = new ArrayList();
        l.add(323);
        l.add("yatendra");
        l.add(22.2);
        l.add('y');

        System.out.println(l + "\n");

        Iterator i = l.iterator();
        while(i.hasNext())  // forward direction
        {
            System.out.println(i.next());
        }

*/







//  Difference b/w list & set

    //  ...............List..................
/*
        List li = new ArrayList();
        li.add(11);
        li.add(1,34);
        li.add(123);
        li.add(null);
        li.add(null);
        li.add(3,99);
        li.add(123);    // duplicate value

        System.out.println("List is : " + li + "\n");
        
        Iterator itr1 = li.iterator();
        int count1=1;
        while(itr1.hasNext())
        {
            System.out.println(count1 + " Iterator : " + itr1.next());
            count1++;
        }

*/
     


    //  ...............Set..................
/* 
        Set s = new HashSet();
        s.add(22);
        s.add(66);
        s.add(33);
        s.add(11);
        s.add(22);  // duplicate values 
        s.add(66);  // duplicate values 
        s.add(null);
        s.add(null);

        System.out.println("HashSet : " + s);

        Iterator itr = s.iterator();
        int count = 1;
        while(itr.hasNext()) {
            System.out.println(count + " iterator : " + itr.next());
            count++;
        }

*/    

        


    }
}
