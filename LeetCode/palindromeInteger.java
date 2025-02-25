class Solution {
    public boolean isPalindrome(int x) {

        String xString = String.valueOf(x);

        int p1 = 0;
        int p2 = xString.length() -1;

        while(p1<=p2){

            if(xString.charAt(p1) == xString.charAt(p2)){
                p1++;
                p2--;
            } else {
                return false;
            }
        }

        return true;  
    }
}