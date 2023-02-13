#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    int n,f;
    scanf("%d",&n);
    f=1;
    for(int i=1;i<=n;i++){
        f=f*i;      
    }
    printf("%d",f);
}
