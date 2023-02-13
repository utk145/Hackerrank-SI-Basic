'''

Q) Given a positive integer N, check whether the number is prime or not.

Input Format:
First and only line of input contains a integer - N.


Constraints:
1 <= N <= 10^12


Output Format:
Print "Yes" if the number is prime, "No" otherwise.


Sample Input 0:
11

Sample Output 0:
Yes

Explanation 0:
Self Explanatory


'''


# Approach 1 : 

isPrime=True
n=int(input())
for i in range(2,n):
    if n%i==0:
        isPrime=False
        break
if isPrime:
    print("Yes")
else:
    print("No")




# Approach 2 :  As the constraints are very large, you will get Time Limit Exceeded(TLE) in the above code, below is the optimised version wherein we avoid checking the repetitive numbers or factors by just iterating till sqaureroot(n).

n=int(input())
if n > 1:
    for i in range(2,int((n)**(1/2))):
        if (n % i)==0:
            print("No")
            break
    else:
        print("Yes")
else:
    print("No")
    
