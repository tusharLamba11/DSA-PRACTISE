class answer{
    Node root;
    static class Node{
        int data;
        Node left,right;
        Node(int d){
            data = d;
            left = right = null;
        }
    }
    static void inOrder(Node n){
        if(n== null)
            return;
        inOrder(n.left);
        System.out.print(n.data + " ");
        inOrder(n.right);
    }
    static void postOrder(Node n){
        if(n== null)
            return;
        postOrder(n.left);
        postOrder(n.right);
        System.out.print(n.data + " ");
    }
    static void preOrder(Node n){
        if(n== null)
            return;
        System.out.print(n.data + " ");
        preOrder(n.left);
        preOrder(n.right);
    }

    public static void main(String args[]){
     answer a = new answer();
     a.root = new Node(1);
     a.root.left = new Node(2);
     a.root.right = new Node(3);
     a.root.left.left = new Node(4);
     a.root.left.right = new Node(5);
     a.inOrder(a.root);
     System.out.print("\n");
     a.postOrder(a.root);
     System.out.print("\n");
     a.preOrder(a.root);
     System.out.print("\n");

    }
}
