public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l=1,r=n,guess=0;
        while(l<=r){
            guess=l+(r-l)/2;
            if(guess(guess)==0){
                return guess;
            }
            else if(guess(guess)==-1){
                r=guess-1;
            }
            else{
                l=guess+1;
            }
        }
        return 0;
    }
}