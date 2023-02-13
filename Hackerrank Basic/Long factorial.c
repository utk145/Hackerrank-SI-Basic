/*

Q) Given a non-negative number - N, print N!


Input Format:
First and only line of input contains a number - N.


Constraints:
0 <= N <= 20


Output Format:
Print factorial of N.


Sample Input 0:
3

Sample Output 0:
6

Explanation 0:
Self Explanatory

*/




#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    // return 0;
    int n;
    long f;
    scanf("%d",&n);
    f=1;
    for(int i=1;i<=n;i++){
        f=f*i;
    }
    printf("%ld",f);
}



