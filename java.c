#include<stdio.h>
int main(){
    int a[100],n,i,m,p;
    printf("enter the size of aaray ::");
    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    printf("enter the element value and pos");
    scanf("%d%d",&m,&p);
    p--;
for (i=n-1;i>=p-1;i--){
    a[i+1]=a[i];
    
}
a[p-1]=m;
    

for(i=0;i<=n;i++){
    printf("%d \n",a[i]);
}
    
    return 0;
}