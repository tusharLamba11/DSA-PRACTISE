#include <stdio.h>

void main(){
    int a[3][3];
    for(int i=0;i<=2;i++){
        for(int j = 0;j<=2;j++){
            if(i>j)
            printf(" ",a[i][j]);
            else
            printf("*",a[i][j]);
        }
        printf("\n");
    }
    
}

/*OR

#include <stdio.h>

void main(){
    int a[3][3];
    for(int i=1;i<=3;i++){
        for(int j=1;j<=3;j++){
            if(j>=i)
            printf("*",a[i][j]);
            else
            printf(" ",a[i][j]);
        }
        printf("\n");
    }
}*/
