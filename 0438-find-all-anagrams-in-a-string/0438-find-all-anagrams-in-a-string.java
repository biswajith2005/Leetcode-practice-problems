class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();
        if(s.length()<p.length()) return res;

        Map<Character,Integer> sMap=new HashMap<>();
        Map<Character,Integer> pMap=new HashMap<>();

        for(char c: p.toCharArray()){
            pMap.put(c,pMap.getOrDefault(c,0)+1);
        }

        int left=0 , count=p.length();

        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);

            sMap.put(ch,sMap.getOrDefault(ch,0)+1);

            if(pMap.containsKey(ch) && sMap.get(ch)<=pMap.get(ch)){
                count--;
            }
            if(right-left+1 >p.length()){
                char leftchar=s.charAt(left);
                if(pMap.containsKey(leftchar) && sMap.get(leftchar)<=pMap.get(leftchar)){
                    count++;
                }
                sMap.put(leftchar,sMap.get(leftchar)-1);
                left++;
        }
        if(count==0){
            res.add(left);
        }
        }
        return res;
    }
}