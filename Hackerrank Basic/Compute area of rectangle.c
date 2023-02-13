/*

Given the length and breadth of a rectangle, print area of the rectangle.


Input Format:
First and only line of input contains two positive integers L - length of the rectangle and B - breadth of the rectangle.


Constraints:
1 <= L, B <=10^9


Output Format:
Print area of the given rectangle.


Sample Input 0:
5 8

Sample Output 0:
40

Explanation 0:
Self Explanatory


*/



#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    long a,b;
    scanf("%ld %ld",&a,&b);
    
    printf("%ld",a*b);
}



// In Java

/*

import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    int b = sc.nextInt();
    int area = l * b;
    System.out.println(area);
  }
}

*/



