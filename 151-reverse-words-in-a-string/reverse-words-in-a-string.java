class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" +");
        StringBuilder res=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            res.append(arr[i]);
            res.append(" ");
        }
        return res.toString().trim();
    }
}