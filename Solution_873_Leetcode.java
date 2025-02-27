class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n=arr.length;
        int maxLen=0;
        Set<Integer> set=new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        for(int start=0;start<n;start++){
            for(int next=start+1;next<n;next++){
                int prev=arr[next];
                int curr=arr[start]+arr[next];
                int len=2;
                while(set.contains(curr)){
                    int temp=curr;
                    curr+=prev;
                    prev=temp;
                    maxLen=Math.max(maxLen,++len);
                }
            }
        }
        return maxLen;
    }
}
