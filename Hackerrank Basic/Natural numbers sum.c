/*

Q)  Given a positive integer N, print the sum of 1st N natural numbers.


Input Format:
First and only line of input contains a positive integer - N.


Constraints:
1 <= N <= 10^4


Output Format:
Print the sum of 1st N natural numbers.


Sample Input 0:
4

Sample Output 0:
10

Explanation 0:
Self Explanatory

*/


#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    ///input n =4 then 1+2+3+4=10
    long n,sum=0,i;
    scanf("%ld",&n);
    for(i=1;i<=n;i++){
        sum=sum+i;
    }
    printf("%ld",sum);
}
