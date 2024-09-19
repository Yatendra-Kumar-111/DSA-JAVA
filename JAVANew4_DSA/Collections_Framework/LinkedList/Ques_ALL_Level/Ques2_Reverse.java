//      Date : 19/09/24         end date - 19/09/24
//  -------------------Middle Related Questions------------------


package Collections_Framework.LinkedList.Ques_ALL_Level;
import java.util.*;
public class Ques2_Reverse {

    private Node head;
    class Node {
        String data;
        Node next;
        Node (String data) {
            this.data = data;
            this.next = null;
        }
    } 
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node currrentNode = head;
        while(currrentNode.next != null) {
            currrentNode = currrentNode.next;
        }
        currrentNode.next = newNode;

    }
    private int len = 0;

    public void printList() {
        if(head == null) {
            System.out.println("List is Empty.");
            return;
        }
        int tempLen = 0;
        Node currentNode = head;
        while(currentNode != null) {
            tempLen++;
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
        len = tempLen;
    }
    public int length() {
        return len;
    }

    public void deleteFirst() {
        if(head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
    }
    public void deleteLast () {
        if(head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node prevNode = head;
        Node currentNode = prevNode.next;
        if(currentNode == null) {
            head = null;
            return;
        }
        while(currentNode.next != null) {
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        prevNode.next = null;
    }

//  Ques 1.  reverse of list by Simple method
/* 
    public void reverse() {
        if(head == null) {
            System.out.println("List is Empty.");
            return;
        }
        Node currentNode = head;
        Node prevNode = null;
        while(currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
*/

// nahi hua ye neche vala 
// Ques 2. reverse of list in pairs 
/*  
    input : 11 -> 44 -> 66 -> 22 -> 55 -> 99 -> 33 -> 77
    k = 3 (user input) (in 1 pair of 3 elements present)
    output : 66 -> 44 -> 11     ->      99 -> 55 -> 22      ->      77 -> 33
 */
/* 
    public Node reversePair (Node head, int k) {
        Node prevNode = null;
        Node curNode = head;
        Node nextNode=curNode.next;
        int c=1;
        while(curNode != null && c<=k) {
            nextNode = curNode.next;
            curNode.next = prevNode;
            prevNode = curNode;
            curNode = nextNode;
            c++;
        }
        if(nextNode != null) {
            head.next = reversePair(nextNode, k);
        }
        return prevNode;

    }
*/


 













    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Ques2_Reverse list = new Ques2_Reverse();
        list.addFirst("22");
        list.addFirst("33");
        list.addFirst("44");
        list.addFirst("55");
        list.addFirst("66");
        list.printList();







//  

        list.printList();


//  Ques 2
        // System.out.print("Enter the number : ");
        // list.reversePair(list.head , 3);

        











        
/* 
        list.addFirst("33");
        list.addFirst("22");
        list.addFirst("11");
        list.printList();

        list.addLast("44");
        list.addLast("55");
        list.printList();

        System.out.println("Length of Linked List is " + list.length());

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        
        System.out.println("\t:::Reverse of list:::");
        list.reverse();
        list.printList();
*/

    }
}
