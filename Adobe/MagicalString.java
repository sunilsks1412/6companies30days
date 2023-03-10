class Solution {
    public int magicalString(int n) {
        StringBuilder sb = new StringBuilder("122");
        int p1 = 2, p2 = sb.length(), count = 0;

        while(sb.length()<n){
            if(sb.charAt(p1)=='1'){
                if(sb.charAt(p2-1)=='1'){
                    sb.append(2);
                } else{
                    sb.append(1);
                }
                p2++;
            } else{
                if(sb.charAt(p2-1)=='1'){
                    sb.append(22);
                } else{
                    sb.append(11);
                }
                p2 += 2;
            }

            p1++;
        }

        for(int i=0; i<n; i++){
            if(sb.charAt(i)=='1') count++;
        }

        return count;
    }
}