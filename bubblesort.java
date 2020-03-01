class Solution {
    public List<Integer> sortArray(int[] nums) {
        for(int i=nums.length-1;i>0;i--){
            int j = 0;
            while(j<i){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
                j++;
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            list.add(nums[i]);

        }
        return list;
    }
}
