#include<stdio.h>
int main(){
    int arr[5],n,top=-1;
    if(top==5-1){
        printf("stack iis full");
    }
    else{
        printf("enter the item");
        scanf("%d",&n);
        top++;
        arr[top]=n;
    }
    return 0;
}