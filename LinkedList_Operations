class answer{
    static Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
            data =d;
            next=null;
        }
    }
    void insertAtBeg(int data){
        Node temp = new Node(data);
        if(head==null) {
            head=temp;
        }
        else {
            temp.next = head;
            head=temp;
        }
    }
    void insertAtEnd(int data){
        Node temp = new Node(data);
        if(head==null)
            head= temp;
        else{
            while(head!=null){
                head = head.next;
            }
            head.next = temp;
        }


    }
    void insertAtPos(int data,Node prev_Node){
        Node temp = new Node(data);
        if(prev_Node == null){
            System.out.println("Previous Node cannot be empty");
        }
        else{
            temp.next=prev_Node.next;
            prev_Node.next=temp;
        }
    }
    
    static Node reverseLL(Node node){
        Node curr=node;
        Node prev = null;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;

            prev=curr;
            curr=next;
        }
        node = prev;
        return node;
    }
    static void printLinkedList(Node node){
        while(node!=null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public static void main(String args[]){
        answer list = new answer();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
        System.out.print("Print LinkedList\n");
        list.printLinkedList(head);
        System.out.print("Print Reverse LinkedList\n");
        head = list.reverseLL(head);
        System.out.print("\n");
        list.printLinkedList(head);
    }
 }
