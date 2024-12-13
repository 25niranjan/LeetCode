class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        int i=0;
        int j=0;
        int freq[]=new int [3];
        while(j<s.length()){
            freq[s.charAt(j)-'a']++;
            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
                count+=s.length()-j;
                freq[s.charAt(i)-'a']--;
                i++;
            }
            j++;
        }
        return count;
    }
}