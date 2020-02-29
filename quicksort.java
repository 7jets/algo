class Solution {
    public List<Integer> sortArray(int[] nums) {
        quicksort(nums,0,nums.length-1);
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            list.add(nums[i]);
        }
        return list;
    }
    private void quicksort(int[] nums,int left,int right){
        int i = left;
        int j = right;
        if(i<j){
            int temp = nums[i];
            while(i!=j){
                while(j>i&&nums[j]>=temp){
                    j--;
                }
                nums[i]=nums[j];
                while(i<j&&nums[i]<=temp){
                    i++;
                }
                nums[j]=nums[i];
            }
            nums[i]=temp;
            quicksort(nums,left,i-1);
            quicksort(nums,i+1,right);
        }
    }
}
