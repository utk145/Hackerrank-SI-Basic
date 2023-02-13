'''
Q) Given an integer N, check whether it is a Harshad number or not.
Note: A Harshad number is an integer, that is divisible by the sum of its digits.

Input Format:
First and only line of input contains a integer - N.


Constraints:
1 <= N <= 10^9


Output Format:
Print "Yes" if the number is a Harshad number, "No" otherwise.


Sample Input 0:
18

Sample Output 0:
Yes

Explanation 0:
18 / (1 + 8) = 2
As 18 is divisible by the sum of its digits, it is a Harshad number.

'''





n=int(input())
m=n
sum=0

while n>0:
    dig=n%10
    sum+=dig
    # n=n/10 #wrong
    n=n//10
if m%sum==0:
    print("Yes")
else:
    print("No")


