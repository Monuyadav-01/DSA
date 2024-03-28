
public class Implementation {
    static Node head;

    public static void insertAtFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public static void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " <-> ");
            node = node.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        insertAtFirst(1);
        insertAtFirst(2);
        insertAtFirst(3);
        insertAtFirst(4);
        display();
    }
}
