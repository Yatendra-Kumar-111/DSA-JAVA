/*              Start_Date : 11-09-2024      To     End_Date : 11-09-24  
                    Thank You :)

                    
Shortcuts -> { (LL-LinkedList) , (obj-object) , (objs-objects) }
        ______________________________
        IMPORTANT POINTS
        ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯
         
        

-------------------------------NOTES-----------------------------





*/





package Collections_Framework.LinkedList.Scratch_or_Detail;

import java.util.LinkedList;    // main library
import java.util.Scanner;  
import java.util.Arrays; 
import java.util.*; 

public class LL {

    Node head;
    private int size;
    LL() {
       this.size = 0; 
    }

    class Node {
        String data;
        Node next;
        // Node head = null;
        Node (String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }


    // add element/obj at first position 
    public void addFirst(String data) {
        
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }


    // add element/obj at Last position 
    public void addLast(String data) {
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

    //  print List all elements/ objs
    public void printList() {
        if(head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node currentNode = head;
        while(currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("Null");
    }

    // delete first
    public void deleteFirst() {
        if(head == null) {
            System.out.println("List is Empty.");
            return;
        }
        size--;
        head = head.next;
    }

    //  delete Last
    public void deleteLast() {
        if(head == null) {
            System.out.println("List is Empty.");
            return;
        }
        Node secondLastNode = head;
        Node lastNode = head.next;

        size--;

        if(lastNode == null) {  // for single node 
            head = null;
            return;
        }

        while(lastNode.next != null) { // for traversing all node
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }

    // size of LL
    public int getSize() {
        return size;
    }

    // reverse of linked list by method 
    public void reverse() {
        if(head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currentNode = head.next;
        
        while(currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;

            prevNode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }


    // reverse of linked list by Recursion
    public Node reverseRecursive(Node head) {
        if(head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseRecursive(head.next);

        head.next.next = head;
        head.next = null;
        return newHead;
    } 


// only for  check 
    public void reverseMyList() {
        if(head == null || head.next == null) {
            return;
        }
        Node curNode = head; 
        Node prevNode = null;
        while(curNode != null) {
            Node temp = curNode.next;

            curNode.next = prevNode;
            prevNode = curNode;
            curNode = temp;
        }
        head.next = null;
        head = prevNode;
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//  1..................Creating a LinkedList..................
        LL list = new LL();


        // System.out.println("----------------addFirst()--------------------");
        list.addFirst("Singh");
        list.addFirst("Kumar");
        list.addFirst("yatendra");
        
/*   
        list.printList();
        
        
        System.out.println("----------------addLast()--------------------");
        list.addLast("I am a");
        list.addLast(" Good");
        list.addLast(" Boy.");

        list.printList();
        
        System.out.println("----------------printList()--------------------");
        list.printList();

        System.out.println("----------------deleteFirst()--------------------");
        list.deleteFirst();
        list.printList();
        
        System.out.println("----------------deleteLast()--------------------");
        list.deleteLast();
        list.printList();
        
        System.out.println("----------------size()--------------------");
        System.out.println("Size of LL is : " + list.getSize());

*/

/* 

        System.out.println("----------------reverse()--------------------");
        System.out.println("\t:::Before Reversing:::");
        list.printList();

        list.reverse();

        System.out.println("\t:::After Reversing:::");
        list.printList();
        System.out.println("------------reverseRecursive()----------------");
        System.out.println("\t:::Before Reversing:::");
        list.printList();

        list.head = list.reverseRecursive(list.head);

        System.out.println("\t:::After Reversing:::");
        list.printList();

*/

        System.out.print("Old list -> ");   
        list.printList();


        list.reverseMyList();

        System.out.print("\nReverse list -> ");   
        list.printList();

        
        
    }
}
