class Solution {
    public String reverseVowels(String s) {
        char arr[]=s.toCharArray();
        int start=0,end=arr.length-1;
        String vowels = "aeiouAEIOU";
        while(start<end){
            while(start<end){
            char ch= arr[start];
            if(vowels.indexOf(ch)!=-1)
            break;
            start++;
        }
            while(start<end){
            char ch= arr[end];
            if(vowels.indexOf(ch)!=-1)
            break;
            end--;
        }
        if(start<end){
            char temp =arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
          }
        }
        return new String(arr);
    }
}