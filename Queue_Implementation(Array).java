class answer{
    static final int MAX =1000;
    static int front,rear;
    static int a[]= new int[MAX];
    answer(){
        front =0;
        rear =0;
    }
    static void push(int d){
     if(rear==MAX-1)
         System.out.print("Overflow");
     
     else
         a[rear++] = d;
    }
    static void pop(){
        if (front == rear) {
            System.out.printf("\nQueue is empty\n");
            return;
        }

        else {
            for (int i = 0; i < rear - 1; i++) {
                a[i] = a[i + 1];
            }

           
            if (rear < MAX)
                a[rear] = 0;

           
            rear--;
        }
        return;
    }
    static void peek(){
        if(front<=0)
            System.out.print("Queue Underflow");
        System.out.print("Peek of th queue is" + a[front]);

    }
    static void isEmpty(){
       if(front==0 && rear==0)
           System.out.print("Queue is empty");
    }
    public static void main(String args[]){
        push(1);
        push(2);
        push(3);
        pop();
        System.out.print("Queue:\n");
        for(int i=0;i<rear;i++)
            System.out.print(a[i]+" ");
    }
}
