/*

Q) Given a positive integer N, print the sum of squares of 1st N natural numbers.

Input Format:
First and only line of input contains positive integer - N.


Constraints:
1 <= N <= 1000


*/

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    int n;
    long sum=0;
    scanf("%d",&n);
    for(int i = 0;i<=n;i++){
            sum=sum+(i*i);
        }
    printf("%ld",sum);
}

