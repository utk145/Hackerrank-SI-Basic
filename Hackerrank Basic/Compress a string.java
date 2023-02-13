/*

Q) Given a string, compress the given string. See example for more details.



Input Format:
Input contains a string S, consisting of lowercase and uppercase characters.



Constraints:
1 <= len(S) <= 100



Output Format:
Print the compressed string.



Sample Input 0:
aaaBBBBhhhekkL


Sample Output 0:
a3B4h3e1k2L1


Explanation 0:
In the given string, a is repeating for 3 times continuosly. So after compression it becomes a3.
Similarly,
B is repeating for 4 times - B4
h is repeating for 3 times - h3
e is repeating for 1 times - e1
k is repeating for 2 times - k2
L is repeating for 1 times - L1

*/












import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1="";
        for(int i=0;i<str.length();i++){
            int count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            str1+=str.charAt(i);
            str1+=count;
        }
       System.out.println(str1);
    
    }
}