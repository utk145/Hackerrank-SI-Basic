/*

Q) Given a number N, reverse the number.


Input Format:
First and only line of input contains a integer - N.


Constraints:
-10^18 <= N <= 10^18


Output Format:
Print the reversed number.


Sample Input 0:
1344

Sample Output 0:
4431

Explanation 0:
Self Explanatory.

*/



#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    long n,rem=0,r=0;
    scanf("%ld",&n);
    while(n!=0){
        rem=n%10;
        r=r*10+rem;
        n=n/10;
    }
    printf("%ld",r);
}


