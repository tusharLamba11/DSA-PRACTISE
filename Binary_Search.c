#include <stdio.h>
int binarySearch(int a[],int num,int i,int j){
    int mid;
    mid=i+j/2;
    if(num==a[mid])
    {
    return mid;
    }
    else if(num<a[mid])
    {
    return binarySearch(a,num,1,mid-1);
    }
    else
    {
    return binarySearch(a,num,mid,j);
    }
    return -1;
}
int main()
{
    int a[]={10,20,30,40,50};
    int result,num,size;
    size = sizeof(a)/sizeof(a[0]);
    printf("Enter a number to be searched");
    scanf("%d",&num);
    result=binarySearch(a,num,0,size-1);
    printf("Present at %d",result);
    return 0;
}
