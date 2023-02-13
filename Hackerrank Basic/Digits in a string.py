'''
Q) Given a string, check if it contains only digits.


Input Format:
Input contains a string S, consisting of ascii characters.


Constraints:
1 <= len(S) <= 100


Output Format:
Print "Yes" if string contains only digits, "No" otherwise.


Sample Input 0:
123456786543

Sample Output 0:
Yes

Explanation 0:
Self Explanatory


Sample Input 1:
"Smart-Interviews"

Sample Output 1:
No

Explanation 1:
Self Explanatory
'''



# Approach 1 

s=input()
x=s.isnumeric()
if x==True:
    print("Yes")
else:
    print("No")





# Approach 2

dig=['0','1','2','3','4','5','6','7','8','9']
s = input()
count=0
for i in s:
    if i not in dig:
        count+=1
    else:
        pass  #'''This else statement isnt required,you can just break in if'''
if count!=0:
    print('No')
else:
    print('Yes') 




