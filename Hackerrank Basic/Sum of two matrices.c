/*

Q)  Given two matrices A and B each of size N x M, print sum of the matrices (A + B)..

Input Format:
First line of input contains N, M - size of the matrices. Its followed by 2*N lines, each containing M integers - elements of the matrices. First N lines for matrix A and the next N lines for matrix B.


Constraints:
1 <= N, M <= 100
-109 <= ar[i] <= 10^9



Output Format:
Print sum of the 2 given matrices (A + B).


Sample Input 0:
2 3
5 -1 3
19 8 4
4 5 -6
1 -2 12


Sample Output 0:
9 4 -3
20 6 16



Explanation 0:
Self Explanatory.

*/



#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    long a[100][100],b[100][100],w[100][100];
    int n,m,i,j;
    scanf("%d %d",&n,&m); //order input
    for( i =0;i<n;i++){
        for(j=0;j<m;j++){
            scanf("%ld",&a[i][j]);
        }
    }
    for(i=0;i<n;i++){
        for(j=0;j<m;j++){
            scanf("%ld",&b[i][j]);
        }
    }
    for(i=0;i<n;i++){
        for(j=0;j<m;j++){
            w[i][j]=a[i][j]+b[i][j];
        }
    }
    for(i=0;i<n;i++){
        for(j=0;j<m;j++){
            printf("%ld ",w[i][j]);  //space for gap b/w elements
            if(j==m-1)
                printf("\n");  //for next line o/p row
        }
    }
}