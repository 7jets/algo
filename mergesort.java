class Solution {
    public List<Integer> sortArray(int[] nums) {
        int[] temp = new int[nums.length];
        sort(nums,0,nums.length-1,temp);

        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            list.add(nums[i]);
        }
        return list;
    }
    private void sort(int[] nums,int left,int right,int[] temp){
        if(left<right){
            int mid = (left+right)/2;
            sort(nums,left,mid,temp);
            sort(nums,mid+1,right,temp);
            merge(nums,left,mid,right,temp);
        }
    }

    private void merge(int[] nums,int left,int mid,int right,int[] temp){
        int l=left;
        int r=mid+1;
        for(int i = 0;i<=right-left;i++){
            if(l<=mid&&r<=right){
                if(nums[l]<=nums[r]){
                    temp[i]=nums[l];
                    l++;
                }
                else{
                    temp[i]=nums[r];
                    r++;
                }
            }
            else if(l<=mid){
                temp[i]=nums[l];
                l++;
            }
            else if(r<=right){
                temp[i]=nums[r];
                r++;
            }
        }
        l=left;
        int i=0;
        while(l<=right){
            nums[l++]=temp[i++];
        }
    }
}
