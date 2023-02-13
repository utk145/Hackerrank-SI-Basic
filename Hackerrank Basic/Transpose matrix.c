/*

Q)  Given a matrix of size N x M, print transpose of the matrix.


Input Format:
First line of input contains N, M - the size of the matrix. Its followed by N lines each containing M integers - elements of the matrix.


Constraints:
1 <= N, M <= 100
-109 <= ar[i] <= 10^9


Output Format:
Print the transposed of the given matrix.


Sample Input 0:
2 2
5 -1
19 8

Sample Output 0:
5 19
-1 8

Explanation 0:
Self Explanatory

*/





#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
     int n,m;
    long a[100][100];
    scanf("%d %d",&n,&m);
    //input 
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            scanf("%ld",&a[i][j]);
        }
    }
    //output -- tranpose
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            printf("%ld ",a[j][i]);
            if(j==n-1){
                printf("\n");}
        }
    }
}