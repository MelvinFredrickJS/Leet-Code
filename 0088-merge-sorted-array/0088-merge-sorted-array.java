class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int fp=m-1;
        int sp=nums2.length-1;
        int place=nums1.length-1;
        while(fp>=0 && sp>=0){
        if(nums1[fp]>nums2[sp]){
            nums1[place]=nums1[fp];
            fp--;
            place--;
        }else{
            nums1[place]=nums2[sp];
            sp--;
            place--;
        }
        }

        while (sp >= 0) {
        nums1[place] = nums2[sp];
        sp--;
        place--;
    }

    }
}