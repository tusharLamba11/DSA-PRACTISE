import org.w3c.dom.Node;

import java.util.HashSet;
import java.util.LinkedList;

class answer{
    
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    static public void push(int new_data)
    {

        Node new_node = new Node(new_data);


        new_node.next = head;


        head = new_node;
    }
    static boolean checkLoop(Node h){
        HashSet<Node> s = new HashSet<Node>();
        while(h!=null) {

            if (s.contains(h))
                return true;

            s.add(h);
            h = h.next;
        }
        return false;
    }
    static void printLL(Node node){
        while(node!=null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String args[]){
        answer s = new answer();
        s.push(10);
        s.push(20);
        s.push(30);
        printLL(head);
        s.head.next.next = s.head;
        if(checkLoop(head))
            System.out.println("Found a loop");

        else
            System.out.println("No loop found");

    }
}
