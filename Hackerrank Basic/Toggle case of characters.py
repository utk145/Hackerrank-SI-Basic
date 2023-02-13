'''
Q) Given a string, toggle the case of each character in the given string.


Input Format:
Input contains a string S, consisting of lowercase and uppercase characters.


Constraints:
1 <= len(S) <= 100


Output Format:
Print the toggled string.


Sample Input 0:
abdBd

Sample Output 0:
ABDbD

Explanation 0:
Self Explanatory

'''



#  Method 1
s=input()
print(s.swapcase())





# Methd 2:

def ans(s):
    toggled_string = ""
    for char in s:
        if char.isupper():
            toggled_char = char.lower()
        else:
            toggled_char = char.upper()
        # Append the toggled character to the toggled string
        toggled_string += toggled_char
    return toggled_string

s = input()
print(ans(s))

