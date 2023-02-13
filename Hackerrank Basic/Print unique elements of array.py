"""
Q) Print unique elements of the array in the same order as they appear in the input.


Input Format:
First line of input contains a single integer N - the size of array and second line contains array elements.


Constraints:
1 <= N <= 100
0 <= ar[i] <= 10^9


Output Format:
Print unique elements of the array.


Sample Input 0:
7
5 4 10 9 21 4 10

Sample Output 0:
5 9 21

Explanation 0:
Self Explanatory.

"""


n=int(input())
m=[]
a=list(map(int,input().split()))
for i in range(n):
    b=a.count(a[i])
    if(b==1):
        m.append(a[i])
for k in m:
    print(k,end=" ")