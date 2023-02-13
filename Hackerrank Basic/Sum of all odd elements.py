'''
Q)  Print sum of all odd elements in an array.


Input Format:
First line of input contains N - the size of the array and second line contains array elements.


Constraints:
1 <= N <= 100
-109 <= ar[i] <= 10^9


Output Format:
Print sum of all odd elements of the given array.


Sample Input 0:
5
6 9 8 4 3

Sample Output 0:
12

Explanation 0:
Self Explanatory

'''




n=int(input())
a=list(map(int,input().split()))
m=[]
for i in a:
    if i%2 != 0:
        m.append(i)
print(sum(m)) 

