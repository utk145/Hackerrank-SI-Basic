'''
Q) Print palindromic right-angled triangle pattern using characters. See example for more details.


Input Format:
First and only line of input contains a integer N - size of the pattern.


Constraints:
1 <= N <= 26


Output Format:
For the given integer N, print the palindromic right-angled triangle pattern.


Sample Input 0:
5

Sample Output 0:
A 
A B A 
A B C B A 
A B C D C B A 
A B C D E D C B A

Explanation 0:
Self Explanatory

'''





n=int(input())
for i in range(1,n+1):
    for k in range(1,i+1):
        print(chr(k+65-1),end=' ')
    for l in range(i-1,0,-1):
        print(chr(l+65-1),end=' ')
    print()
    
    
'''
Python chr() function is used to get a string representing of a character which points to a Unicode code integer. For example, chr(97) returns the string 'a'. This function takes an integer argument and throws an error if it exceeds from the specified range. The standard range of the argument is from 0 to 1,114,111.
'''    

