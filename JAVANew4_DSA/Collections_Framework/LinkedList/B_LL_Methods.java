package Collections_Framework.LinkedList;
/*                          Date : 28-Aug-2024(s)  - (e)  

            (s) - start         (e) - end
---------------------------NOTES---------------------------



Collection C_Obj -> C_Obj is object of collection.

---------------------------Imp Points / Interesting-------------------------
1). if we add / set itself list. then it show 'this collection'.
    means -> list.add(2, list);
    here, list - this is collection obj & 2 is index & add is method


---------------------------Methods-------------------------

1). remove() -> it remove first obj of the list. 
        it return : removed obj.
2). remove(obj) -> obj matches with list objs & if obj present in list then remove that obj otherwise, does not change anything in list. Always first occurence of obj will remove. 
        return : boolean
3). remove(index) ->         return : removed obj. 


4). removeFirst() & removeLast() -> return : removed obj.

5). removeFirstOccurrence() & removeLastOccurrence()-> return : boolean
                            First & Last occurrence obj removed if same multiple obj present.
                            if obj is not present then nothing change in list.
                            parameter is compulsory to provide 
6). get(index) ->   get obj by given index
                    return :  obj 

7). getFirst() & getLast() -> return : First obj & Last Obj of the list
                           
8). indexOf() & lastIndexOf() -> return :
                                    if valid obj then give index of obj.
                                    otherwise, give -1 value

9). 

                            



*/



import java.util.*;


public class B_LL_Methods {
    public static void main(String[] args) throws NullPointerException, Exception{
        


// .....................Methods {Start}.....................



    // 4........
// /*
        ArrayList al = new ArrayList(
            List.of(
            "Teja",
            "Pankaj",
            "Shajid",
            "Kedar",
                "Virat",
                "Hardik")
            );

        LinkedList ll = new LinkedList();
        ll.add(11);
        ll.add("Shalin");
        ll.add(78);
        ll.add("TGY");
        ll.add(3.14);
        ll.add("Chaaru");
        ll.add("TGY");
        System.out.println("Old List : \t" + ll);

        String s = ll.toString();
        System.out.println("String : " + s);

        // System.out.println(ll.toArray());

        // System.out.println("New List : \t" + ll);

                // LinkedList list = new LinkedList();
        // list = ll;
        // System.out.println("New List : \t" + list);


//  */




    // 3.........clear(), isEmpty(), contains(), get(), getFirst(), getLast(), indexOf(), lastIndexOf(), set(),  
/*
        ArrayList al = new ArrayList(
            List.of(
            "Teja",
            "Pankaj",
            "Shajid",
            "Kedar",
                "Virat",
                "Hardik")
            );

        LinkedList ll = new LinkedList();
        ll.add(11);
        ll.add("Shalin");
        ll.add(78);
        ll.add("TGY");
        ll.add(3.14);
        ll.add("Chaaru");
        ll.add("TGY");
        System.out.println("Old List : \t" + ll);


        // ll.clear();
        // if(ll.isEmpty())
        //     System.out.println("LinkedList is Empty.");
        // else 
        //     System.out.println("LinkedList is Not Empty.");
        
        
        // String a = ll.contains(11) ? "\tObj contain" : "\tObj NOT contain";
        // System.out.println(a);

        // System.out.println(ll.get(3));
        // System.out.println(ll.get(6));
        

        // System.out.println(ll.getFirst());
        // System.out.println(ll.getLast());


        // System.out.println(ll.indexOf("TGY"));
        // System.out.println(ll.indexOf("999"));
        

        // System.out.println(ll.lastIndexOf("TGY"));
        // System.out.println(ll.lastIndexOf("999"));
        
        
        // ll.set(2, "set_Element");
        // ll.set(1, ll);
        // System.out.println("New List : \t" + ll);

 */





        
    
    //  2........remove(), remove(index), remove(obj), removeAll(), removeFirst() , removeLast(), removeFirstOccurrence(), removeLastOccurrence() 
/*
        ArrayList al = new ArrayList(
            List.of(
            "Teja",
             "Pankaj",
              "Shajid",
               "Kedar",
                "Virat",
                 "Hardik")
            );

        LinkedList ll = new LinkedList();
        ll.add(11);
        ll.add("Shalin");
        ll.add(78);
        ll.add("TGY");
        ll.add(3.14);
        ll.add("Chaaru");
        ll.add("TGY");
        System.out.println("Old List : \t" + ll);


        // ll.remove();    // it remove first obj- of the list.
        // ll.remove("TGY");    // 
        // ll.remove(1);
        // System.out.println("New List : \t" + ll);
        

        // ll.removeFirst();
        // ll.removeLast();
        // System.out.println("New List : \t" + ll);


        // ll.removeFirstOccurrence("TGY");
        // ll.removeLastOccurrence("TGY");
        // System.out.println("New List : \t" + ll);
        
        // ll.addAll(al);
        // System.out.println("Add : List : \t" + ll);
        // ll.removeAll(al);
        // System.out.println("Remove : New List : \t" + ll);




        // System.out.println(ll.removeFirstOccurrence("TGY")); // only for check return type of method
        // System.out.println(ll.removeLast()); // only for check return type of method


       
*/
       






    //  1........add(), add(index, ele-), addFirst(), addLast(), addAll(C_Obj) , addAll(index, C_Obj) methods
/* 
                ArrayList al = new ArrayList(
            List.of(
            "Teja",
             "Pankaj",
              "Shajid",
               "Kedar",
                "Virat",
                 "Hardik")
            );

        LinkedList ll = new LinkedList();
        ll.add(11);
        ll.add(78);
        ll.add(55);
        ll.add(null);
        System.out.println(ll);

        ll.add(2,"TGY");
        System.out.println(ll);
        
        ll.addFirst(99);
        ll.addLast("Yatendra");

        System.out.println(ll);


        System.out.println("Old List : \t" + ll);
        // ll.add(al);
        // ll.addFirst(al);
        // ll.addAll(al);
        // ll.addAll(3, al);
        System.out.println("New List : \t" + ll);


*/





// .....................Constructor.....................
/* 
    //  2........Parameterised constructor....... 
    //  LinkedList list = new LinkedList(C);
        ArrayList a1 = new ArrayList();
        a1.add(11);
        a1.add("yatendra");
        a1.add(88.8);
        a1.add('t');

        LinkedList l1 = new LinkedList(a1); // a1 is Collection(i.e., ArrayList)

        System.out.println(l1);
        l1.add(333);
        l1.add(333);
        l1.add(null);
        System.out.println(l1);




    //  1........Empty constructor....... No parameter
    //  LinkedList list = new LinkedList();
        LinkedList ll = new LinkedList();

        ll.add(22);
        ll.add(11);
        ll.add(33);
        ll.add(null);
        ll.add("77");

        System.out.println(ll);

*/
       






    }
}
