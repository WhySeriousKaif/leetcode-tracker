// Last updated: 02/05/2026, 11:11:30
1class Solution {
2    public boolean isPalindrome(String s) {
3        StringBuilder newStr=new StringBuilder();
4        for(char ch:s.toCharArray()){
5             if(Character.isLetterOrDigit(ch)){
6                newStr.append(Character.toLowerCase(ch));
7             }
8        }
9
10        return newStr.toString().equals(newStr.reverse().toString());
11        
12    }
13}