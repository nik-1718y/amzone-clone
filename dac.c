#include<stdio.h>
int main(){
    int a[50],n,i,e,p;
 printf("enter the size of array :");
 scanf("%d",&n);
 for(i=0;i<n;i++){
    scanf("%d",&a[i]);
 }
 printf("enter the position of deletion::");
 scanf("%d",&p);
 n++;
 for(i=p-1;i<n;i++){
   a[i]=a[i+1];
 }
 //a[p-1]=e;
 for(i=0;i<n;i++){
    printf("%d\n",a[i]);
 }
 return 0;
}