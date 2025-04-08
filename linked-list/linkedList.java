
import java.util.Scanner;


class linkedList {
    // create a seperate class for Node
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        Node head = null;
        head = createLinkedList(3, head);

        //1. insertion at the end of the linked list
        int data = 24; 
        head= insertOneAtEnd(head, data);
        head= insertOneAtEnd(head, 25);
        head= insertOneAtEnd(head, 26);
        head= insertOneAtEnd(head, 27);
        head= insertOneAtEnd(head, 28);

        //2. insertion at the beginning of the linked list
        head= insertOneInBeginning(head, -1);

        //3. find the length of the linked list
        lengthOfLinkedList(head); 
        //4. find the middle of the linked list
       middleOfLinkedList(head);
        //5. find the kth node from the end of the linked list
        kthNodeFromEnd(head, 2);
        //6. find the kth node from the beginning of the linked list-[SKIPPING]
        //7. delete the kth node from the end of the linked list
        //head= deleteKthNodeFromEnd(head, 2);
        //8. delete the kth node from the beginning of the linked list
        //9. delete the head
        //10. delete the tail
        //11. use fast and slow pointer to find the middle of the linked list
        //12. detect cycle in a linked list
        //13. reverse the linked list
        //14. reverse the linked list in groups of k
        //15. rotate the linked list by k nodes
        //16. merge two sorted linked lists
        //17. partitioning a linked list 
        //18. LRU cache implementation using linked list

        // print the linked list
        printLinkedList(head);
    }

    // helper function to print all the nodes in the linked list
    static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    // helper function to create a linked list with n nodes
    public static Node createLinkedList(int n, Node head) {
        for (int i = 0; i < n; i++) {
            Node newNode = new Node(i);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }
        return head;
    }
    // 1. helper function to insert a node at the end of the linked list
    public static Node insertOneAtEnd(Node head, int data){
        Node newNode = new Node(data);
        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    // 2. helper function to insert a node at the beginning of the linked list
    public static Node insertOneInBeginning(Node head, int data){
        Node newNode= new Node(data);
        newNode.next=head;
        head=newNode;
        return head;
    }

    // 3. helper function to find the length of the linked list
    public static void lengthOfLinkedList(Node head){
        int count=0;
        Node current=head;
        while(current!=null){
            count++;
            current= current.next;
        }
        System.out.println("Length of the linked list is: "+count);
    }
    //4. helper function to find the middle of the linked list
    public static void middleOfLinkedList(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("Middle of the linked list is: "+slow.data);
    }
    //5. helper function to find the kth node from the end of the linked list- traversal kind of problem
    public static void kthNodeFromEnd(Node head, int k){
        Node current=head;
        int length=0;
        while(current!=null){
            length++;
            current=current.next;
        }
        int value= length-k-1;
        System.out.println("The length of the linked list is: "+ length + " and the kth node from the end is: "+value);
        current=head;
        for(int i=0;i<length; i++){
            if(i==value){
                System.out.println("The kth node from the end of the linked list is: "+current.data);
            }
            current=current.next;
        }
    }
    // 7. helper function to delete the kth node from the end of the linked list
    // public static Node deleteKthNodeFromEnd(Node head, int value){
    //     int length=0;
    //     Node current= head;
    //     while(current!=null){
    //         length++;
    //         current=current.next;
    //     }
    //     return current;

    // }
}