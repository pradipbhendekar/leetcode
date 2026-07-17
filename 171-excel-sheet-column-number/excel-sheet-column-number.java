class Solution {
    public int titleToNumber(String cTitle) {
        int result=0;
        for(int i=0;i<cTitle.length();i++){
            int temp=(cTitle.charAt(i) - 65)+1;
            result=result * 26 + temp;
        }
        
        return result;
    }
}