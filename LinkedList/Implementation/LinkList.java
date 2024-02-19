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

    public static void print(Node head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = implementationAtStart();
        print(head);
    }
}