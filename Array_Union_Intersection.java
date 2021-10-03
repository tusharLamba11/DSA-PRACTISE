class answer{
    static void arrayIntersection(int a[],int b[],int n,int m){
        int i=0,j=0;
        while(i<n && j<m){
            if(a[i]<b[j])
                i++;
            else if(b[j]<a[i])
                j++;
            else {
                System.out.print(b[j++] + " ");
                i++;
            }

        }

    }
    static void arrayUnion(int a[],int b[],int n,int m){
        int i=0,j=0;
        while(i<n && j<m){
            if(a[i]<b[j])
                System.out.print(a[i++] + " ");
            else if(b[j]<a[i])
                System.out.print(b[j++] + " ");
            else{
                System.out.print(b[j++] + " ");
                i++;
            }
            while (i < m)
                System.out.print(a[i++] + " ");
            while (j < n)
                System.out.print(b[j++] + " ");

        }
    }

    public static void main(String args[]){
    int a[] = {1,2,3,4,5};
    int b[] = {4,5,6,7,8};
    int n = a.length;
    int m = b.length;
    arrayIntersection(a,b,n,m);
    System.out.print("\n");
    arrayUnion(a,b,n,m);
    }
 }
