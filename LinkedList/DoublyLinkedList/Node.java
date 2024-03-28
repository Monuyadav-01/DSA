/**
 * Node
 */
public class Node {

    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        prev = null;
        next = null;
    }
}