class answer{
    static final int MAX =1000;
    static int a[] = new int[MAX];
    static int top;
    answer(){
        top=-1;
    }
    static void push(int d){

        if(top==a.length){
          System.out.println("Overflow");
        }
        else{
            a[top++] = d;
        }

    }
    static void pop(){

         if(top<=0)
             System.out.println("Underflow");
         else {
             top--;
         }
    }
    static int peek(){
        if(top<0)
            System.out.print("Stack Underflow");
        return (a[top]);
    }
    static boolean isEmpty(){
       return(top<0);
    }
    public static void main(String args[]){

        push(1);
        push(22);
        push(3);
        pop();
        System.out.print("Print the elements of the stack\n");
        for(int i=0;i<top;i++){
            System.out.print(a[i] + " ");
        }
    }
}
