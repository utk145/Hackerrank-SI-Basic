'''
Q) Given an integer N, check whether it is a Narcissistic number or not.
Note: A narcissistic number is a number that is the sum of its own digits each raised to the power of the number of digits


Input Format:
First and only line of input contains a integer - N.


Constraints:
0 <= N <= 10^9


Output Format:
Print "Yes" if the number is Narcissistic number, "No" otherwise.


Sample Input 0:
8208

Sample Output 0:
Yes

Explanation 0:
84 + 24 + 04 + 84 = 8208
'''



n=int(input())
m=n
sum=0
digi=len(str(n))
while n>0:
    dig=n%10
    sum+=dig**digi
    # n=n/10 #wrong
    n=n//10
if m==sum:
    print("Yes")
else:
    print("No")

