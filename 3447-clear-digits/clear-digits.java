class Solution {
    public String clearDigits(String s) {
        StringBuilder res= new StringBuilder();
        for(char a : s.toCharArray()){
            if(a>='0'&& a<='9'){
                if(res.length() >0){
                    res.deleteCharAt(res.length()-1);
            }
                }else{
                    res.append(a);
                }
        }
        return res.toString();
    }
}
