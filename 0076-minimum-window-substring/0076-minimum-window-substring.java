class Solution {
    public String minWindow(String s, String t) {
        // char ch = 'A';
        // array[ch]++; // Yeh piche se array[65]++ hi ban jata hai
        // the concept of targetMap is ki A hai toh arr[65] pr jaake frequency ko +1 kardega

        // 1st step 
        if(s.length()<t.length()){
            return "";
        }

        int[] targetMap=new int[128];
        int requiredCount=0;
        //Loop to fill the target map and check for unqiue letters in the string and 
        // filling their frequencies at ASCII index suppose arr[65]= 2 means 2 'A's in the
        // string

        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(targetMap[c]==0){
                requiredCount++;
            }
            targetMap[c]++;
        }

        int left=0;
        int [] windowMap=new int[128];
        int matchedCount=0;
        int minLen=Integer.MAX_VALUE;
        int startIndex=0;
        //Loop for s string to manipulate the window size 
        for(int right=0; right<s.length();right++){
            char rChar=s.charAt(right);
            windowMap[rChar]++;
            if(targetMap[rChar]>0 && windowMap[rChar]==targetMap[rChar]){
                matchedCount++;
            }
            //When window is valid tab ye steps karne hai
            while(matchedCount==requiredCount){
                // Checking ki minLen right-left+1 se chota hai and updation 
                if(right-left+1<minLen){
                    minLen=right-left+1;
                    startIndex=left;
                }
                char lChar=s.charAt(left);
                windowMap[lChar]--;
            
            if(targetMap[lChar]>0 && windowMap[lChar]<targetMap[lChar]){
                matchedCount--;
            }
            left++;
            }
        }
        return minLen==Integer.MAX_VALUE?"":s.substring(startIndex,startIndex+minLen);



    }
}