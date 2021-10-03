#include<stdio.h>
void main()
{
    int a[5]={20,10,30,15,25};
    int temp;
    
    for(int i=0;i<5;i++)
    {
     for(int j=i+1;j<5;j++){
         if(a[i]>a[j])
         {
             temp=a[i];
             a[i]=a[j];
             a[j]=temp;
         }
     } 
     
    }
    printf("Sorted array");
    for(int k=0;k<5;k++)
    printf("%d",a[k]);
    
}
