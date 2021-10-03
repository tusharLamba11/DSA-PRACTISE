#include<stdio.h>
void swap(int a[],int i,int j)
{
    int temp=a[i];
    a[i]=a[j];
    a[j]=temp;
}
int partition(int a[],int l,int h)
{
   int pivot = a[h];
   
   int i=(l-1);
   
   for(int j=l;j<=h-1;j++)
   {
     if(a[j]<pivot)
     {
     i++;
     swap(a,i,j);
     }
   }
   swap(a,i + 1,h);
   return (i + 1);
   
}
void quicksort(int a[],int l,int h)
{
    if(l<h)
    {
        int p = partition(a,l,h);
    
    quicksort(a,l,p - 1);
    quicksort(a,p + 1,h);
    }
}
void printArray(int arr[], int size)
{
    for(int i = 0; i < size; i++)
        printf("%d",arr[i]);
          
    
}
void main()
{
    int a[]={10,7,8,9,1,5};
    int n=6;
    quicksort(a,0,n-1);
    printf("Sorted Array");
    printArray(a, n);
}
