package csen703.main.assignment1;

public class RingToss {
    public static int RingTossGreedy(int [] pegs){
        if (pegs == null || pegs.length ==0)
            return 0;

        if(pegs.length == 1)
            return pegs[0];

        int count = pegs[0];

        for (int i = 1; i < pegs.length; i++) {
            if (pegs[i] >= pegs[i - 1]) {
                count += pegs[i] - pegs[i - 1];
            }
        }

        return count;
    }

}
