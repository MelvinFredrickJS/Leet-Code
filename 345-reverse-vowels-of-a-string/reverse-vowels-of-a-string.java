class Solution {
    public String reverseVowels(String s) {
        String check="AEIOUaeiou";
        char arr[]=s.toCharArray();
        int start=0;
        int end=arr.length-1;
        while(start<end){
            while(start<end && check.indexOf(arr[start])==-1){
                start++;
            }
            while(start<end && check.indexOf(arr[end])==-1){
                end--;
            }
            char ch=arr[start];
            arr[start]=arr[end];
            arr[end]=ch;
            start++;
            end--;
        }
        return new String(arr);
    }
}