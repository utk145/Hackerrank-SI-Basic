'''
Q) Given a string, check if it contains only vowels.


Input Format:
Input contains a string S, consisting of lowercase and uppercase characters.


Constraints:
1 <= len(S) <= 100


Output Format:
Print "Yes" if string contains only vowels, "No" Otherwise.


Sample Input 0:
SmartInterviews

Sample Output 0:
No

Explanation 0:
Self Explanatory


'''



s = input().lower()
vowels=['a','e','i','o','u']
nahin = 0
for i in s:
    if i not in vowels:
        nahin+=1
        break
if nahin==0:
    print("Yes")
else:
    print("No")