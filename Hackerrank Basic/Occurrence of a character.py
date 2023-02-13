'''
Q) Given a sentence S and a character ch, count occurrence of the given character in the sentence


Input Format:
First line of input contains a sentence - S and second line of input contains a single lowercase character - ch.


Constraints:
1 <= len(S) <= 100


Output Format:
Print count of the given character in the sentence.


Sample Input 0:
Data Structures & Algorithms
s

Sample Output 0:
2

Explanation 0:
Self Explanatory

'''


s=input()
# Approach 1 : inbuilt function
h=input()
print(s.count(h))



# Approach 2 : counting

s=input()
h=input()
count=0
for ch in s:
    if(ch==h):
        count+=1
print(count)






