/*
Q) Given the length of 3 sides of a triangle, check whether the triangle is valid or not.

Input Format:
First and only line of input contains three integers A, B, C - length of sides of the triangle.


Constraints:
1 <= A, B, C <= 10^9


Output Format:
Print "Yes" if you can construct a triangle with the given three sides, "No" otherwise.


Sample Input 0:
4 3 5

Sample Output 0:
Yes

Explanation 0:
Self Explanatory

*/





#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

   long x,y,z,s1,s2,s3;
    scanf("%ld %ld %ld",&x,&y,&z);
    s1=x+y;
    s2=y+z;
    s3=z+x;
    if(s1>z&&s2>x&&s3>y){
        printf("Yes");
        }else{
         printf("No");
    }
        
        
        
}
