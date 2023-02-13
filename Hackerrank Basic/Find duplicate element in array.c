/*

Q) Find a duplicate element in the given array of integers. There will be only a single duplicate element in the array.


Input Format:
First line of input contains size of the array - N and second line contains the elements of the array.


Constraints:
2 <= N <= 100
0 <= ar[i] <= 10^9


Output Format:
Print the duplicate element from the given array.


Sample Input 0:
6
5 4 10 9 21 10


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

    int n;
    long s[514];
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        scanf("%ld",&s[i]);
    }
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(s[i]==s[j]){
                printf("%ld",s[i]);
                break;
            }
        }
    }
}
