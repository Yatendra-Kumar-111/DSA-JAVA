/*              Date : 11  - 08 - 2024  end date : 22-08-24 -> Thank You :)
-------------------------------NOTES-----------------------------

Shortcuts -> { (AL-ArrayList) , (obj-object) , (objs-objects) , (on - object name)}
        ______________________________
                IMPORTANT POINTS
        ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯
1.  it's size always equal to total number of elements present in ArrayList. it always adjust their size.

2.  obj2.add(obj1) method -> obj1 & obj2 are AL. Here, all elements of obj1 are bind in a single group/obj then that group passed to obj1. that group count as a single unit. means if we find the size of obj2 then we will be shown only 1.

3.  



        ______________________________
                Initialise
        ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯

->  List<E> li = new ArrayList<E>();    &    List<E> li = new ArrayList<>();
1st E compulsory but 2nd E not compulsory





        ______________________________
            Constructors in ArrayList
        ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯

    (i) ArrayList() -> to build an empty array list.

    (ii) ArrayList(Collection c) -> to build an array list initialized with the elements from the Collection c.

    (iii) ArrayList(int capacity) -> to build an array list with the initial capacity being specified.


        ______________________________
            Constructors in ArrayList
        ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯







-------------------------------Methods-----------------------------
      
1) obj.add(value) or obj.add(int index, value) -> value(Wrapper class or Primitive type or Object) 
2) obj.size();          -> return the size / capcity of ArrrayList. 

3) List.of();           -> 
4) Arrays.asList();     -> 

5) oN.contains(value)   -> it checked the element present in arraylist or not.
                        return - boolean value


6). oN.get()            -> return - a value of AL & parameter - index ( should be in 'int' type) 
7). oN.indexOf(value)   -> return - index at given value. & if value is not present in list then return -1
8). oN.lastIndexOf() -> same as indexOf() but it start from end of list.
9). oN.remove(index)     -> parameter - index(int) & return - value at given index
10). oN.remove(object)  -> parameter - obj of collection & return - boolean value
11). oN.removeAll(collection) -> parameter - collection obj & return - boolean value
12). oN.



----------------------------Methods in Details--------------------------

1. obj.add() method -> it is used for two purpose :-
                        ◇ add(int index , Object element) ->  insert a specific element at a specific position index in a list.
                        ◇ add(Object a) -> append a specific element to the end of a list.

2. Arrays.asList(obj1, obj2, obj3....) => this is used for passed the objects to constructor.

3. oN.indexOf(value) -> Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.

4. oN.lastIndexOf() -> Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.

5. oN.remove(index)  -> Removes the element at the specified position in this list.

6. oN.remove(object) -> Removes the first occurrence of the specified element from this list, if it is present.
we cannot remove element directly passing in remove() method otherwise exception found.


7.oN.removeAll(collection c) -> Removes from this list all of its elements that are contained in the specified collection.

8. oN.set(int index, value/obj) -> it replace the old obj.

 */


package Collections_Framework.ArrayList;

import java.util.*;
import java.lang.Exception; 

public class ArrayListMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        



//  12...Use of set() method................................................

        // ArrayList ar = new ArrayList();
        // ar.add("hi");
        // ar.add("tgy");
        // ar.add(" ESe hi");
        // ar.add("What are");
        // ar.add("you doing?");
        // ar.add("...Yatendra..");

        // System.out.println("::::Before::::\n" + ar);
        // ar.set(0, 9999);
        // ar.set(1, (ar.get(5)));
        // System.out.println("::::After::::\n" + ar);




//  12...Use of removeRange() method................................................

        // ArrayList ar = new ArrayList();
        // ar.add("hi");
        // ar.add("tgy");
        // ar.add(".");
        // ar.add("What are");
        // ar.add("you doing?");

        // ar.removeRange(2,5);
        // System.out.println();




//  11...Use of remove() & removeAll() method................................................
// /* 
        ArrayList ar = new ArrayList(){
            {
                add(11);
                add(22);
                add(33);
                add(44);
                add(55);
                add(44);
                add(55);
            }
        };
        // ArrayList ar = new ArrayList(
        //     List.of(11,22,33,44,55, 44, 22, 2121)
        //     );
        ArrayList ar1 = new ArrayList();
        ar1.add(22);
        ar1.add(99);
        ar1.add(88);
        ar1.add(44);
        ar1.add(99);

        // System.out.println(ar.remove(ar1));

        // System.out.println("\t:::Before:::\n" + ar);
        // ar.remove(2);   // for given index 
        // System.out.println("\t:::After:::\n" + ar);


        System.out.println("\n\t:::Before:::\n" + ar);
        // System.out.println("\n\t:::Before:::\n" + ar1);
        ar.remove(ar1);   // this is not generate any desired output 
        // this is not perform any operations on ar1 obj
        System.out.println("\t:::After:::\n" + ar);
        // System.out.println("\t:::After:::\n" + ar1);
        
        
        
        System.out.println("\n\t:::Before:::\n" + ar);
        ar.removeAll(ar1);   // for given collection obj 
        System.out.println("\t:::After:::\n" + ar);
        

        // System.out.println("\n\t:::Before:::\n" + ar);
        // ar.remove(22);  // 22 element/obj of al is present in al but we cannot remove element directly passing in remove() method otherwise exception found.
        // System.out.println("\t:::After:::\n" + ar);


        // System.out.println("\n\n"+ar1);
   
// */    



//  10...Use of isEmpty() method................................................
/* 
        ArrayList ar = new ArrayList(
            List.of(11,22,33,44,55, 44, 22, 2121)
            );
        if(ar.isEmpty())
            System.out.println("List is empty.");
        else 
            System.out.println("List is not empty.");

*/    


//  9...Use of indexOf() & lastIndexOf() method................................................
/*       
        ArrayList ar = new ArrayList(List.of(11,22,33,44,55, 44, 22, 2121));
        System.out.println("Return the index of given value : " + ar.indexOf(55));
        System.out.println("Return the index of given value : " + ar.indexOf(77) + "\t77 is not present in list.");

        System.out.println("Return the index of given value : " + ar.lastIndexOf(22));
        System.out.println("Return the index of given value : " + ar.lastIndexOf(77) + "\t77 is not present in list.");

*/






//  8...Use of get() method................................................
/* 
        ArrayList ar = new ArrayList(List.of(11,22,33,44,55));
        
        System.out.println("::::Use of get() method::::");
        System.out.println(ar);
        // int index = 0;
        System.out.print("Please entered index : ");
        int index = sc.nextInt();

        if(index < 0 || index > ar.size())
            System.out.println("Your entered value is out of arraylist's index.");
        else
            System.out.println("The value at " + index + " index : " + ar.get(index));

 */



//  7...Use of contains() method................................................
/* 
        ArrayList ar = new ArrayList(
            // Arrays.asList("33", "33")
            List.of(33,4,55)
        );

        System.out.print("Please entered number : ");
        int num = sc.nextInt();

        System.out.println(":::::Use of contains() method:::::\n" + ar + "\nThe number is : " + num);

        if(ar.contains(num))
            System.out.println(num + " is present in arraylist.");
        else
            System.out.println(num + " is Not present in arraylist.");

*/






//  6...Use of clone() method................................................
/* 
        ArrayList al1 = new ArrayList(); // empty list
        ArrayList al = new ArrayList();
        al.add(2);
        al.add(1);
        al.add(3);
        al.add(5);
        System.out.println("Before =>\t" + al);
        System.out.println("Before =>\t" + al1);
        System.out.println("Size of al1 => " + al1.size());

        al1.add(al.clone());
        al1.add(al.clone());    // 2nd time 

        System.out.println("\tAfter => " + al);
        System.out.println("\tAfter => " + al1);
        System.out.println("Size of al1 => " + al1.size());

*/





//  5...Use of clear() method................................................
/* 
        ArrayList al = new ArrayList();
        ArrayList al1 = new ArrayList(); // empty list
        al.add(2);
        al.add(1);
        al.add(3);
        al.add(5);
        System.out.println("Before =>\t" + al);
        System.out.println("Before =>\t" + al1);

        al.clear();
        al1.clear();

        System.out.println("\tAfter => " + al);
        System.out.println("\tAfter => " + al1);

*/








//  4...Use of addAll() method................................................
        // ArrayList a1 = new ArrayList(List.of(11,'a','b', true ) );
        // ArrayList a2 = new ArrayList(a1);
        // ArrayList a3 = new ArrayList();

        // // System.out.println("\t:::::AL-1:::::\n" + a1 + "\n\tSize : "  + a1.size() + "\n");

        // a3.add(a2);
        // System.out.println("\t:::::AL-3:::::\n" + a3 + "\n\tSize : "  + a3.size() + "\n");
        
        // a3.addAll(a2);
        // System.out.println("\t:::::AL-3:::::\n" + a3 + "\n\tSize : "  + a3.size() + "\n");


        // ArrayList aa = new ArrayList();
        // ArrayList aa1 = new ArrayList();
        // // ArrayList<Integer> aa = new ArrayList<Integer>();
        // // ArrayList<Integer> aa1 = new ArrayList<>();
        // aa.add(2);
        // aa.add(33);
        // aa.add(11);

        // aa1.addAll(aa);
        // aa1.addAll(aa);
        // // System.out.println(aa1.addAll(aa));

        // System.out.println(aa1);

        // System.out.println(aa1.addAll(aa));
        // // System.out.println(aa1.addAll(2, aa));


        // System.out.println(aa);
        // System.out.println(aa1);
        // System.out.println(aa.addAll(2, aa1));





//  3...Use of add() method................................................
/* 
        ArrayList<Integer> abc = new ArrayList<Integer>();
        abc.add(33);
        abc.add(33);
        abc.add(66);
        abc.add(11);
        abc.add(3,222);
        // System.out.println(abc.add(22)); // return boolean value
        // System.out.println(abc);
        System.out.println();



//  .............print arraylist by loop.............
        // for(Integer a : abc)
        for(int i=0; i<abc.size(); i++)
            System.out.print(abc.get(i) + "\t");

*/
        





//  2...Constructors of ArrayList................................................

    // (i)  empty ArrayList => ArrayList()
        // ArrayList arr = new ArrayList();
        // System.out.println(":::::Before:::::\t(empty list) \n\t" + arr.size());
        // arr.add(22);
        // arr.add(44);
        // arr.add(65);
        // System.out.println("ArrayList is : " + arr);
        // System.out.println(":::::After:::::\t(Elements add in list) \n\t" + arr.size());




    // (ii)  ArrayList(int capacity)
        // ArrayList a1 = new ArrayList(4);
        // a1.add(34);
        // a1.add(54);
        // a1.add(73);
        // System.out.println(":::::Before:::::");
        // System.out.println("ArrayList is : " + a1 + "\tcapacity or size of ArrayList is " + a1.size());
        // a1.add(72);
        // a1.add(24);
        // System.out.println("\n:::::After:::::");
        // System.out.println("ArrayList is : " + a1 + "\tExtra Elements added in list, size is " + a1.size());




    // (iii)  ArrayList(Collection c)   &   also use of 'add()' method
/*
        ArrayList a1 = new ArrayList(
            List.of(22, 33,44,"tgy", 22, "YK")
        );
        System.out.println("\t:::::AL-1:::::\n" + a1);
        System.out.println("\tSize : " + a1.size() + "\n");
        
        
        ArrayList a3 = new ArrayList(List.of("yatendra", "kumar", "singh"));
        ArrayList a2 = new ArrayList();
        // ArrayList a2 = new ArrayList(List.of(a1, a3)); // we can pass direct objs
        
        a2.add(a1);
        a2.add(a3);
        System.out.println("\t:::::AL-2:::::\n" + a2);
        System.out.println("\tSize : " + a2.size() + "\n");
        
    // we can add element/obj at specific position of index
        a2.add(1, a3); 
        a2.add(0, 33875); 
        
        System.out.println("\t:::::AL-2:::::\n" + a2);
        System.out.println("\tSize : " + a2.size() + "\n");
        
*/




//  1...Initialize an ArrayList in Java................................................



    //  (iv).Initialization using  stream() and collect() methods




    //  (iii).Initialization using asList()

        // List li = new ArrayList(Arrays.asList("yatendra", "kumar", "singh"));
        // System.out.println(li);


        // ArrayList a1 = new ArrayList(
        //     List.of(1,2, "tgy", 3, 'G')
        //     );
        // System.out.println(a1);


        // ArrayList<String> my = new ArrayList<String>(
        //     List.of("Tgy", "ku", "sin")            
        // );
        // System.out.println(my);







    //  (ii).Using shorthand version of this method
    /*   
        ArrayList<Integer> aa = new ArrayList<Integer>() {
            {
                add(22);
                add(32);
                add(44);
                add(66);
            }
            {
                add(1);
                add(2);
                add(3);
                add(4);
            }
        };

        System.out.println("ArrayList -> " + aa);
    */



    //  (i).Basic / Simple 
    /*   
        ArrayList al = new ArrayList();
        al.add(33);
        al.add("yatendra");
        al.add(3.445);
        al.add('T');
        System.out.println(al);


        ArrayList<Integer> aln = new ArrayList<>(3);
        System.out.println(aln.size());
        aln.add(33);
        aln.add(22);
        aln.add(35);
        aln.add(11);
        System.out.println(aln.size());
    */







    }
}
