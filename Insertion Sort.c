#include<stdio.h>
void main()
{
    int a[5] = {20,10,30,15,25};
    int temp;
    
    for(int i=1;i<5;i++)
    {
        for(int j=0;j<i;j++)
        {
            if(a[j]>a[i])
            {
                temp=a[j];
                a[j]=a[i];
                a[i]=temp;
            }
        }
    }
    printf("Sorted Array");
    for(int k=0;k<5;k++)
    printf("%d",a[k]);
    
    
}
