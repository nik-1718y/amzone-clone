#include<stdio.h>
int main(){
    int a[100],i,n,p;
    printf("enter the size of array:: ");
    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    printf("array of element is ::\n");
    for(i=0;i<n;i++){
        printf("%d\n",a[i]);
    }
    printf("enter the deletion value is ::");
    scanf("%d",&p);
    for(i=p-1;i<n;i++){
        a[i]=a[i+1];
    }
    printf("array after deltion ::\n");
    for(i=0;i<n;i++){
        printf("%d\n",a[i]);
    }
    return 0;
    }