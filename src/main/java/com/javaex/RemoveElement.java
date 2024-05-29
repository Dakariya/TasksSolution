package com.javaex;

public class RemoveElement {
    public static int[] removeElem(int[] nums, int val) {
//        int k = 1;
//        int result = 0;
//
//        for(int i=0; i<nums.length; i++){
//            if(nums[i]!=val){
//                result=k++;
//            }
//        }        return Arrays.stream(nums)
//                .filter(i->i!=val)
//                .toArray();

//        int k = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != val) {
//                nums[k]=nums[i];
//                k++;
//            }
//        }return nums;

//        int index = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != val) {
//                nums[index] = nums[i];
//                index++;
//            }
//        }
//        return index;

      for(int i=0; i<nums.length; i++){
          if(nums[i]!=val){

               int[] arr=new int[]{nums[i]};
          }
      }
      return nums;
    }
}
