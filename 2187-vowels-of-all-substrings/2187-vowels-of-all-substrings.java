class Solution {
    public long countVowels(String word) {
        long count=0;
      long prev=0;
      for(int i=0;i<word.length();i++){
        char c=word.charAt(i);
        if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u'){
            prev+=i+1;
            
        }
        count+=prev;

      }
      return count;
        
    }
}