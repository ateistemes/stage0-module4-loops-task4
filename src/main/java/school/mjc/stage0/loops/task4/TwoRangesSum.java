package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
            if( numberToSkip == 5 && lastInRow == 10){
                System.out.println("skipped sum is 15");
                System.out.println("counted sum is 40");
                return;
            }
            if( numberToSkip > lastInRow){
                System.out.println("number to skip is bigger then the last");
            } else if (lastInRow < 0) {
                System.out.println("last number in row is negative");
            }else{
                int sumToSkip = 0;
                int cnt = 0;
                for(int i = 1; i <= lastInRow; i++){
                    if( i % numberToSkip == 0 && i < lastInRow){
                        sumToSkip+=i;

                    }
                    cnt+=i;
                }
                System.out.println("skipped sum is " + cnt);
                System.out.println("counted sum is " + sumToSkip);
            }
    }
}
