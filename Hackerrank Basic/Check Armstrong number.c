/*

Q) Given an integer N, check whether it's an Armstrong number or not.
Note: Armstrong number is a number that is equal to the sum of cubes of its digits.


Input Format:
First and only line of input contains a integer - N.


Constraints:
0 <= N <= 109


Output Format:
Print "Yes" if the number is an Armstrong number, "No" otherwise.


Sample Input 0:
153

Sample Output 0:
Yes

Explanation 0:
13 + 53 + 33 = 153

*/


#include <stdio.h>
#include <math.h>

int ans(int n) {
    int count = 0;
    while (n != 0) {
        count++;
        n /= 10;
    }
    return count;
}

int main() {
    int n, original_number, digit, sum = 0, number_of_digits;
    scanf("%d", &n);
    original_number = n;
    number_of_digits = ans(n);
    while (n != 0) {
        digit = n % 10;
        sum += pow(digit, number_of_digits);
        n /= 10;
    }
    if (sum == original_number) {
        printf("Yes\n");
    } else {
        printf("No\n");
    }
    return 0;
}

