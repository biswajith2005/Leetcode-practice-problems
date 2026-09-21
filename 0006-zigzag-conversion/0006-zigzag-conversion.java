class Solution {
    public String convert(String s, int numRows) {
        StringBuilder sbs[]=new StringBuilder[numRows];

        for(int i=0;i<numRows;i++){
            sbs[i]=new StringBuilder();
        }
        int index=0;
        char []arr=s.toCharArray();
        int n=arr.length;

        while(index<n){
            for(int j=0;j<numRows && index<n;j++){
                sbs[j].append(arr[index++]);
            }
            for(int j=numRows-2;j>0 && index<n;j--){
                sbs[j].append(arr[index++]);
            }
        }
        StringBuilder res=sbs[0];
        for(int i=1;i<numRows;i++){
            res.append(sbs[i].toString());
        }

        return res.toString();
    }
}