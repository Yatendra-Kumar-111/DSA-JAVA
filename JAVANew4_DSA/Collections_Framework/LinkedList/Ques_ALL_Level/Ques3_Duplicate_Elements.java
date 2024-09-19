//  chhod diya ye topic 

package Collections_Framework.LinkedList.Ques_ALL_Level;

public class Ques3_Duplicate_Elements {

    private Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currrentNode = head;
        while (currrentNode.next != null) {
            currrentNode = currrentNode.next;
        }
        currrentNode.next = newNode;

    }

    private int len = 0;

    public void printList() {
        if (head == null) {
            System.out.println("List is Empty.");
            return;
        }
        int tempLen = 0;
        Node currentNode = head;
        while (currentNode != null) {
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
    public void checkList() {
        if(head == null) {
            System.out.println("List is Empty.");
            return ;
        }
    }



//  Ques 1. How many duplicate elements present in list?
// /* 
 

// */ 





    public static void main(String[] args) {

        Ques3_Duplicate_Elements list = new Ques3_Duplicate_Elements();


        // list.addFirst("11");
        list.addLast("444");
        list.addLast("11");
        list.addLast("22");
        list.addLast("444");
        list.addLast("22");
        list.addLast("44");
        list.addLast("66");
        list.addLast("99");

        list.printList();

    }
}
