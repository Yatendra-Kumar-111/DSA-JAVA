package Collections_Framework.ArrayList;
/*                          Date : 01-Aug-2024  
---------------------------NOTES---------------------------

    Syntax : ArrayList<Integer>  myListName = new ArrayList<Integer>();


1...Primitive dataType is not allowed into Angular brackets '< >' only Wrapper Classes are allowed.(Integer, Boolean, Double, Float, Character, Short etc.)



obj_name => oN     (short cut, i will writing many places, so understand)


-------------------------[Methods]-------------------------
1...obj_name.add(element_enter) -> to add new elements in last position.
2...oN.get(index) -> get an element present at index.
3...oN.add(index, element) -> add new element at specified postion ( or between elements).
4...oN.set(index, element) -> change the value of specified position (present element changed by new element)
5...oN.remove(index) -> it delete the element at given index.
6...oN.size(no parameter) -> it return the size of arraylist
7...Collections.sort(arrayList_Name) -> it sorting the arraylist.



*/


// package JAVANew4_DSA;
// package JAVANew4_DSA.Collections_Framework.ArrayList;

// import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class A_ArrayList_1_Basic {
// public class List {
    public static void main(String[] args) {
        

        ArrayList <Integer> myList = new ArrayList<Integer>();
        
    // --------------[Assigning Values by 'obj_name.add()' Method]------------------
	System.out.println("\n-----------------add() method Used & Assigning Values in ArrayList-----------------");
        myList.add(11);
	myList.add(22);
	myList.add(44);
	myList.add(99);
	myList.add(22);
	myList.add(41);

	System.out.println("\nArrayList is : " + myList);

	        
    // --------------[oN.get() Method]------------------
	System.out.println("\n-----------------get() method Used-----------------");
        System.out.println("Get an element at index 3 => " + myList.get(3));
	
	int n = myList.get(2);
	Integer n1 = myList.get(2);
        System.out.println("Get an element at index 2 by int => " + n);
        System.out.println("Get an element at index 2 by Integer => " + n1);



    // --------------[oN.add(index, element) Method]------------------
	System.out.println("\n-----------------add() method Used but given position-----------------");
        myList.add(2, 345);
	System.out.println("Add a number at index 2 => " + myList.get(2));
	System.out.println(myList);
	
	myList.add(6, 9999);
	System.out.println("Add a num at index 6 => " + myList.get(6));
	System.out.println(myList);	



    // --------------[oN.set(index, element) Method]------------------
	System.out.println("\n-----------------set() method Used-----------------");
	System.out.println("::::Before::::\t"+myList);
	myList.set(2, 777);
	System.out.println("::::After::::\t"+myList);



    // --------------[oN.remove(index) Method]------------------
	System.out.println("\n-----------------remove() method Used-----------------");
	System.out.println("::::Before::::\t"+myList);
	myList.remove(1);
	System.out.println("::::After::::\t"+myList);

	System.out.println("::::Before::::\t"+myList);
	myList.remove(3);
	System.out.println("::::After::::\t"+myList);


    // --------------[oN.size(no parameter) Method]------------------
	System.out.println("\n-----------------size() method Used-----------------");

	System.out.println("Size of ArrayList is => " + myList.size());
	
	for(int i=0; i<myList.size(); i++)
		System.out.print(myList.get(i) + " ");


	
    // --------------[Collections.sort(arrayList_Name) Method]------------------
	System.out.println("\n-----------------Collections.sort(arrayList_Name) method Used-----------------");
	System.out.println(":::Before Sort:::\t" + myList);
	Collections.sort(myList);		// always write out side the sout.
	System.out.println(":::After Sort:::\t" + myList);










        // ArrayList <Character> myList = new ArrayList<Character>();


	System.out.println("\n\n--------Thank You--------");


    }
}
