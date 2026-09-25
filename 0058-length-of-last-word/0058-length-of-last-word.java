class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
        int counter=0;
        // skip spaces
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        while(i>=0 && s.charAt(i)!=' '){
            counter++;
            i--;
        }
        return counter;
    }
}