class Solution {
    public String longestPalindrome(String s) {

        int p1;
        int p2;
        int count=0;
        int reset=-1;
        String right;
        String left;
        String palindrome;
        String solution = "";

        for(int i = 0; i< s.length();i++){

            p1 = i;
            p2 = s.length()-1;
            reset = -1;
            count =0;

            right = "";
            left = "";
            Character c = s.charAt(i);

            while(p1<=p2) {

                
                if(c == s.charAt(p2)){
                    count++;
                    if(count==2){
                        reset = p2;
                    }
                }

                if(s.charAt(p1) == s.charAt(p2) & p1!=p2 & p2-p1!=1){

                    right = s.charAt(p1) + right;
                    left += s.charAt(p2);
                    p1++;

                } else if (p1 == p2){
                    palindrome = left + s.charAt(p1) + right;
                    if(palindrome.length()>= solution.length()){
                        solution = palindrome;
                    }
                } else if (p2-p1 == 1 & s.charAt(p2) == s.charAt(p1)){

                    right = s.charAt(p2) + right;
                    left += s.charAt(p1);
                    p1++;


                    palindrome = left + right;
                    if(palindrome.length()>= solution.length()){
                        solution = palindrome;
                    }
                }
                else {
                    right = "";
                    left = "";
                    p1 = i;
                    
                    if(reset!=-1){
                        p2=reset;
                        right = s.charAt(p1) + right;
                        left += s.charAt(p2);
                        p1++;
                        reset =-1;
                        count = 0;
                    }
                    else if(s.charAt(p2)==s.charAt(p1)){
                        right = s.charAt(p1) + right;
                        left += s.charAt(p2);
                        p1++;
                    }
                }
                p2--;
            }
            
        }

        return solution;
        
    }
}