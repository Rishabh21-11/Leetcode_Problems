class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int index = 0;
        int highest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > highest){
                highest = arr[i];
                index = i;
            }
        }
        return index;
    }
}