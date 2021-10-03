#include<stdio.h>
void main()
{
    int a[]={0,1,1,0,2,2,1,0};
    int count0,count1,count2,i;
    for(i=0;i<9;i++)
    {
        if(a[i]==0)
        count0++;
        else if(a[i]==1)
        count1++;
        else 
        count2++;
    }
    i=0;
    while(count0>0)
    {
        a[i++]=0;
        count0--;
    }
    while(count1>0){
        a[i++]=1;
        count1--;
    }
    while(count2>0){
        a[i++]=2;
        count2--;
    }
    for(int j=0;j<9;j++)
    printf("Sorted array without using sorting algo for 0,1,2 %d",a[j]);
    
}
