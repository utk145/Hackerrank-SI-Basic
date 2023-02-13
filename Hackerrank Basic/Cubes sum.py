'''
Q) Given a positive integer N, print the sum of cubes of 1st N natural numbers.

Input Format:
First and only line of input contains a positive integer - N.


Constraints:
1 <= N <= 10^2


Output Format:
Print the sum of cubes of 1st N natural numbers.


Sample Input 0:
4

Sample Output 0:
100

Explanation 0:
Self Explanatory

'''


n=int(input())
sum=0
for i in range(1,n+1):
    sum += i*i*i
print(sum)