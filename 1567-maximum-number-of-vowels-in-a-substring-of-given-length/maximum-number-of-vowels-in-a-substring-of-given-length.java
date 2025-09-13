class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character>ck=new HashSet<>();
        ck.add('a');
        ck.add('e');
        ck.add('i');
        ck.add('o');
        ck.add('u');

        int window=0;
        for(int i=0;i<k;i++){
            if(ck.contains(s.charAt(i))){
                window++;
            }
        }
        int maxwindow=window;
        for(int i=k;i<s.length();i++){
            if(ck.contains(s.charAt(i-k))){
                window--;
            }

            if(ck.contains(s.charAt(i))){
                window++;
            }
            maxwindow=Math.max(maxwindow,window);
        }
        return maxwindow;
    }
}