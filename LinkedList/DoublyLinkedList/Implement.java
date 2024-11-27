import java.util.Scanner;

public class Implement {

  public static Node start()
  {
     @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
        Node head = null;
        Node tail = null;

        System.out.println("Enter numbers to add to the doubly linked list (-1 to stop):");
        int data = sc.nextInt();

        while (data != -1) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
            data = sc.nextInt();
        }
        return head;
  }




  public static void print(Node head)
  {
    while(head!=null)
    {
      System.out.print(head.data + "->");
      head = head.next;
    }
  }

public static Node convertArrayToll(int [] arr)
{
  int n = arr.length;

  if (arr.length == 0) {
    return null;
  }
  Node head = new Node(arr[0]);
  Node tail = head;
  for (int i = 1; i < n; i++) {
    Node temp = new Node(arr[i]);
    tail.next = temp;
    temp.prev = tail;
    tail = temp;
  }
  return head;
}

public static int llLength(Node head)
{
  if (head == null)
    return 0;
  int count = 0;
  while (head != null) {
    count++;
    head = head.next;
  }
  return count;
}

// insert at positions k
public static Node insertAtK(Node head, int k, int data) {
  if (k == 0) {
    if (head != null) {
      Node newNode = new Node(data);
      newNode.next = head;
      head.prev = newNode;
      return newNode;
    } else {
      return new Node(data);
    }
  }
  int n = llLength(head);
  if (k > n)
    return head;

  Node current = head;
  int count = 0;
  while (head != null && count < k - 1) {
    count++;
    current = current.next;
  }
  Node newNode = new Node(data);
  Node temp = current.next;
  current.next = newNode;
  newNode.prev = current;
  newNode.next = temp;
  temp.prev = newNode;

  return head;
}
public static  Node deleteHead(Node head)
{

  if (head == null || head.next == null)
    return null;
  // head.prev = null;
  return head.next;
}

public static Node deleteTail(Node head)
{
  if (head == null || head.next == null) {
    return null;
  }
  Node current = head;
  while (current.next.next != null) {
    current = current.next;

  }
  Node temp = current.next;
  current.next = null;
  temp.prev = null;
  return head;
}

public static Node deleteNode(Node head, int k)
{
  int n = llLength(head);
  if(k == 0)
  {
    return deleteHead(head);
  }
  if(k == n-1)
  {
    return deleteTail(head);
  }
  Node current = head;
  if (n < k)
    return head;
  
  int count =0;
  while(current != null && count<k-1)
  {
    count++;
    current = current.next;
  }
  Node temp = current.next.next;
  current.next = temp;
  temp.prev = current;
  return head;
}

public static void main(String[] args) {
   
    Node head = start();
    Node delete_node = deleteNode(head, 2);
    print(delete_node);
   
  }
}
