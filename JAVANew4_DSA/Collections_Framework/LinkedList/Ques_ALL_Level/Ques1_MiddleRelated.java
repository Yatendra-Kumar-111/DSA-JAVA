//      Date : 13 - 09 - 24         end date - 18/09/24
//  -------------------Middle Related Questions------------------

package Collections_Framework.LinkedList.Ques_ALL_Level;
import java.util.*;


// Question 1. Print the Middle of a given linked list
public class Ques1_MiddleRelated {
    Node head;
    class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    } 
    private int len = 0;
    public void printList() {   // for printing linked list 
        if(head == null){
            System.out.println("List is Empty.");
            return;
        }
        Node currentNode = head;
        while(currentNode != null) {
            len++;
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }
    public int length() {   //  for length of linked list
        return len;
    }
    public void addFirst(String data) {    // add element at first position in linked list
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data) {    // add element at first position in linked list
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode; 
    }









//  Ques 4. How to find the middle element of linked list?
/* 
    public String middleElement() {
        if(head == null) {
            return "List is Empty.";
        }

        Node currentNode = head;
        if(length()%2 != 0) {   // for odd
            for(int i=1; i<=length()/2; i++) {
                currentNode = currentNode.next;
            }
        } else {    // for even
            Node temp = head;
            for(int i=1; i<=length()/2; i++) {
                currentNode = currentNode.next;
                if(i>1) {
                    temp = temp.next;
                }
            }
            return temp.data + " & " +  currentNode.data;
        }

        return currentNode.data;
    }

*/



//  Ques 3. How to insert in the middle of a Linked List (at a specified index)
/* 
// this is only valid for middle of list means not for first & last position.

    // public void addMiddle(int position, Node newNode) {
    public void addMiddle(int position, String newNodeData) {
        Node currentNode = head;
        Node newNode = new Node(newNodeData);
        // newNode.data = newNodeData;

        for(int i=1; i<position-1; i++) {
        // while(currentNode != null) {
            currentNode = currentNode.next;
        }
        if(currentNode.next != null) {
            Node tempNode = currentNode.next;
            
            currentNode.next = newNode;
            newNode.next = tempNode;
        }
    }

*/



//  Ques 2. remove the nth node from end of the list and returns its end. 
/* 
    public void nThNodeRemove(int position) {
        int prevNodePos = length() - position; // it gives us to previous node position of nth node.
        Node currentNode = head;
        for(int i=1; i<prevNodePos; i++) {
            currentNode = currentNode.next;
        }
        System.out.println("You want to remove this node from linked list :::: " + currentNode.next.data);

        currentNode.next = currentNode.next.next;
    }
*/





//  Ques 1. the nth node Access from end of the list. 
/* 
    public void nThElementAccess (int position) {
        int nThNodePos = length() - position + 1;   // this is from starting pos & this given exact location of element
        Node curNode = head;

        for(int i=1; i<nThNodePos; i++) {
            curNode = curNode.next;
        }

        System.out.println( curNode.data + " Element is at " + (nThNodePos) + " position from starting.");
        // System.out.println("Position => " + nThNodePos);

    }
*/








    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ques1_MiddleRelated list = new Ques1_MiddleRelated();
        list.addFirst("22");
        list.addFirst("44");
        list.addFirst("55");
        // list.printList();
        list.addLast("77");
        list.addLast("99");
        list.addLast("111");
        list.addLast("77");
        list.addLast("99");
        list.addLast("111");

        System.out.print("List is => ");
        list.printList();   
        // System.out.println("\nLength -> " + list.length());
        
        









//  Ques 4. How to find the middle element of linked list?
        // System.out.println("\nMiddle element : " + list.middleElement());



        
//  Ques 3. How to insert in the middle of a Linked List (at a specified index)
/*         
        System.out.print("\nEnter the new Position/index (Starting from 1) : ");
        int position = sc.nextInt();

        System.out.print("Enter the new Element : ");
        // int n = sc.nextInt();
        String ele = sc.next();

        // String s = Integer.toString(n);  // all methods work are same int to string conversion.
        // String s = String.valueOf(n);    // all methods work are same int to string conversion.
        // String s = n + "";  // all methods work are same int to string conversion.

        if(position > 0 && position <= list.length()) {
            list.addMiddle(position, ele);
        } else System.out.println("You entered wrong position.");


        System.out.print("\nList is => ");
        list.printList();
        
*/





//  Ques 2. remove the nth node from end of the list and returns its end. 
        // System.out.print("\n[---------Position should be less than " + (list.length()+1) + "---------]\nPlease Enter the position from last : ");
        // int position = sc.nextInt();

        // list.nThNodeRemove(position);

        // System.out.print("\nList is => ");
        // list.printList();








//  Ques 1. the nth node Access from end of the list. 
/* 
        int len = list.length();
        System.out.println("\nLength of List  => " +len);

        System.out.print("[---------Position should be less than " + (len+1) + "---------]\nPlease Enter the position from last : ");
        int position = sc.nextInt();
        if(position <= len && position > 0) {
            list.nThElementAccess(position);
        } else {
            System.out.println("You entered wrong position.");
        }
*/




    }

}