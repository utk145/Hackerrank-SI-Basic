# This is a very very classic problem and depending on the type of constarints the approach varies. (Must Explore)


'''
Q) Given two integers a and b, compute a power b.
Note: Do not use any inbuilt functions/libraries for your main logic.


Input Format:
First and only line of input contains two positive integers a and b.


Constraints:
1 <= a <= 100
0 <= b <= 9


Output Format:
Print a power b.


Sample Input 0:
2 3

Sample Output 0:
8

'''




# Approach 1 -  inbuilt function

a,b=map(int,input().split())
print(pow(a,b))



# Approach 2 -  exponentaition power operator
a,b=map(int,input().split())
print(a**b)



# Approach 3 - Using recursion (This version is a very optimised code)
def pwr(a,n):
    if(n==0):
        return 1
    x=pwr(a,int(n/2))
    if(n%2==0):
        return x*x
    else:
        return a*x*x

m,w=map(int,input().split())    
print(pwr(m,w))    
