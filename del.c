#include <stdio.h>
int main (){
    int a[100],n,i,p;
    printf("enter the size of array ::");
    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    printf("array is ::\n");
    for(i=0;i<n;i++){
        printf("%d\n",a[i]);
    }
    printf("enter the deletion value ::\n");
    scanf("%d",&p);
    for(i=p-1;i<n;i++){
        a[i]=a[i+1];
    }
    printf("array is after deletion ::\n");
    for(i=0;i<n;i++){
        printf("%d\n",a[i]);
    }
    return 0;
}