class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder res=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                res.append(Character.toLowerCase(c));
            }
        }
        String clean=res.toString();
        String Reve=res.reverse().toString();
        return clean.equals(Reve);
    }
}