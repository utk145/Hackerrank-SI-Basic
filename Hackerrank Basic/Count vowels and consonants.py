'''
Q) Given a string, print count of vowels and consonants in the string.


Input Format:
Input contains a string S, consisting of lowercase and uppercase characters.


Constraints:
1 <= len(S) <= 100


Output Format:
Print count of vowels and consonants in the given string, separated by space.


Sample Input 0:
aBxbbiAasPw

Sample Output 0:
4 7

Explanation 0:
Self Explanatory

'''



s=input().lower()
vowel,consonant = 0,0
# vowel_l=['a','e','i','o','u']
for i in s:
    if(i=='a' or i=='e' or i=='i' or i=='o' or i=='u'):
        vowel+=1
print(vowel,len(s)-vowel)    
