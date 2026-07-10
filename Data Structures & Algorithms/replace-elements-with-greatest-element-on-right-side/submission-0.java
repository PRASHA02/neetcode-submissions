class Solution {
    public int[] replaceElements(int[] arr) {
        int temp = 0;
        int[] aryTemp = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr.length == 1)
             return new int[]{-1};
            for(int j=i+1;j<arr.length;j++){
                if(j < arr.length){
                    if(arr[j] > temp){
                        temp = arr[j];
                    }else
                        temp = temp;
                }
            }
            if(i<=arr.length - 2)
                aryTemp[i] = temp;  
                temp = 0; 
        }
        aryTemp[arr.length-1] = -1;
        return aryTemp;
    }
}