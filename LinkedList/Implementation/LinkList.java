package Implementation;

import java.util.Scanner;

/**
 * LinkList
 */
public class LinkList {

    public static Node implementationAtStart() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        Node head = null;
        while (data != -1) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static Node implementAtEnd()
    {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node head = null;
        Node tail = null;
        while(data != -1)
        {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            data = sc.nextInt();

        }
        return head;
    }

    public static Node deleteHead(Node head)
    {
        if(head == null || head.next == null)
        {
            return null;
        }

        // Node temp = head;
        head = head.next;
        return head;
        
    }
    public static Node deleteEnd(Node head)
    {
        if (head == null || head.next == null) {
            return null;
        }
        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = null;
        return head;
    }
    
 

    public static void print(Node head) {

        while (head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }
    }

       public static Node insertAtHead(Node head, int data)
       {
           if (head == null) {
               Node newNode = new Node(data);
               return newNode;
           }

           Node newNode = new Node(data);
           newNode.next = head;
           head = newNode;
           return head;
       }
    
       public static Node insertAtTail(Node head, int data)
       {
        Node tail =head;
        if(head == null)
        {
            Node newNode = new Node(data);
            return newNode;
        }
        if(head.next == null)
        {
            Node newNode = new Node(data);
            head.next = newNode;
            return head;
        }
        while (tail.next != null) {
            tail = tail.next;
        }
        Node newNode = new Node(data);
        tail.next = newNode;
        tail = newNode;
        return head;

       }
    
public static int llLength(Node head)
{
    if (head == null) {
        return 0;
    }
    int count = 0;
    while (head != null) {
        count++;
        head = head.next;
    }
    return count;
}

public static Node deleteNode(Node head, int k)
{
    if (head == null)
        return null;

    int n = llLength(head);
    if (k > n) {
        return head;
    }

    if (k == 0) {
        return head.next;
    }
    Node current = head;
    int count = 0;
    while (current != null && count < k - 1) {
        count++;
        current = current.next;

    }
    if (current == null || current.next == null) {
        return head;
    }
    current.next = current.next.next;
    return head;
} 

public static Node insertAtK(Node head, int k , int data)
{
    int n = llLength(head);
    if(k ==0 )
    {
        return insertAtHead(head, data);
    }
    if(n == k)
    {
        return insertAtTail(head, data);
    }
    if(k > n)
    {
        return head;
    }
    Node tail = head;
    int count =0;
    while(tail != null && count < k - 1)
    {
        count++;
        tail = tail.next;
    }
    Node newNode = new Node(data);
    Node temp = tail.next;
    tail.next = newNode;
    tail = newNode;
    tail.next = temp;
    return head;
}


    public static void main(String[] args) {
        Node head = implementAtEnd();
        // print(head);
    //    Node newTail = insertAtTail(head, 5);
    //    print(newTail);
    //    System.out.println(llLength(newTail));

    // Node delete_node_k = deleteNode(head, 3);
    // print(delete_node_k);
        
    Node insertK = insertAtK(head, 2, 15);
    print(insertK);
    }
}