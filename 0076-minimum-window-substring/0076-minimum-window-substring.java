class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> tmap=new HashMap<>();
        for(char c: t.toCharArray()){
            tmap.put(c,tmap.getOrDefault(c,0)+1);
        }
        int left=0,count=t.length();
        int min = Integer.MAX_VALUE;
        String ans="";
        Map<Character,Integer> smap=new HashMap<>();
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            smap.put(ch,smap.getOrDefault(ch,0)+1);

            if(tmap.containsKey(ch)&& smap.get(ch)<=tmap.get(ch)){
                count--;
            }

            while(count==0){
                if(right-left+1<min){
                    min=right-left+1;
                    ans=s.substring(left,right+1);
                }
                char leftchar=s.charAt(left);
                smap.put(leftchar,smap.get(leftchar)-1);
                if(tmap.containsKey(leftchar)&& smap.get(leftchar)<tmap.get(leftchar)){
                    count++;
                }
                left++;
            }
        }
        return ans;
    }
}