class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int k=p.length();
        List<Integer> result=new ArrayList<>();
        int pcount[]=new int [26];
        for(int i=0;i<k;i++ ){
            pcount[p.charAt(i)-'a']++;
        }
        
        for(int i=0;i<=n-k;i++){
            int kcount[]=new int[26];
            for(int j=i;j<i+k;j++){
                kcount[s.charAt(j)-'a']++;
            }
            if(Arrays.equals(pcount,kcount)){
            result.add(i);
        }
        }
        return result;
    }
}