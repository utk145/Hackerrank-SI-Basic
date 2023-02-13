'''


Q)  Find maximum element from the given array of integers.

Input Format:
First line of input contains N - the size of the array and second line contains the elements of the array.


Constraints:
1 <= N <= 100
-109 <= ar[i] <= 10^9


Output Format:
Print the maximum element of the given array.

Sample Input 0:
5
-2 -19 8 15 4

Sample Output 0:
15


Explanation 0:
Self Explanatory

'''


n=int(input())
l=list(map(int,input().split()))
print(max(l))


