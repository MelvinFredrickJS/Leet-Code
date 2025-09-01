class Solution {
    public int compress(char[] chars) {
        String comp="";
        char ptr=chars[0];
        int times=0;
        for( char ch : chars){
            if(ptr==ch){
                times++;
            }else{
                comp+=ptr+(times>1?""+times:"");
                ptr=ch;
                times=1;
            }
        }
        comp+=ptr+(times>1?""+times:"");
        for(int i=0;i<comp.length();i++){
            chars[i]=comp.charAt(i);
        }
        return comp.length();
    }
}