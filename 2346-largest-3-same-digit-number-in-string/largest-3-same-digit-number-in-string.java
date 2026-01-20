class Solution {
    public String largestGoodInteger(String num) {
        int max=-1;
        int count=1;
        for(int i=0;i<num.length()-1;i++){
            if(num.charAt(i)==num.charAt(i+1)){
                count++;
            }else{
                count=1;
            }
            if(count==3){
                String str=num.substring(i-1,i+2);
                int numi=Integer.parseInt(str);
                max=Math.max(max,numi);
            }
        }
        if(max==-1){
            return "";
        }
        if(max==0){
            return "000";
        }
        return String.valueOf(max);
    }
}