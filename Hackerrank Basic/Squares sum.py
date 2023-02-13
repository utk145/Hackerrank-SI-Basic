'''
Q) Given a positive integer N, print the sum of squares of 1st N natural numbers.

Input Format:
First and only line of input contains positive integer - N.


Constraints:
1 <= N <= 1000

'''

n=int(input())
sum=0
for i in range(1,n+1):
    sum += i*i
print(sum)