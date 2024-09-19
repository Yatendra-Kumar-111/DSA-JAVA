package Collections_Framework.LinkedList.Ques_ALL_Level;

public class Z_Check_reverse {


}


/*  -----------------------reverse check------------------
public class Z_Check_reverse {

    Node head;
    public class Node {
        public String data;
        Node next;
        Node (String data) {
            this.data = data;
            this.next = null;
        }  
    }
        public void addFirst(String data){
            Node newNode = new Node(data);
            if(head == null ) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public void showList(){
            if(head == null) {
                System.out.println("List is Empty.");
                return;
            }
            Node currNode = head;
            while(currNode != null) {
                System.out.print(currNode.data + " -> ");
                currNode = currNode.next;
            }
            System.out.println("null");
        }


        public void reverse() {
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


//   again check
        public void myReverse() {
            if(head ==null || head.next == null){
                return;
            }
            Node currentNode = head;
            Node prevNode = null;
            while(currentNode != null) {
                Node temp = currentNode.next;

                currentNode.next = prevNode;
                prevNode = currentNode;
                currentNode = temp;
            }
            head.next = null;
            head = prevNode;
        }





    
    public static void main(String[] args) {
        

//  Ques 0. reverse of linked list

        Ques1_MiddleRelated list = new Ques1_MiddleRelated();
        list.addFirst("22");
        list.addFirst("32");
        list.addFirst("42");
        list.addFirst("66");
        
        System.out.print("Original Linked List => ");
        list.showList();

        System.out.print("Reverse of Linked List => "); 
        list.myReverse();
        list.showList();

        // System.out.println( );
        
    }

}

 */



