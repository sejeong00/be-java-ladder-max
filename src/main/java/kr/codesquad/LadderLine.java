package kr.codesquad;

import java.util.Random;

public enum LadderLine {
    VERTICAL("|"){
        @Override
        boolean validate(int index) {
            return isOdd(index);
        }
    },
    HORIZONTAL("-"){
        @Override
        boolean validate(int index) {
            return !isOdd(index) && isPicked();
        }
    };
    
    private final String line;

    LadderLine(String line) {
        this.line = line;
    }

    abstract boolean validate(int index);

    private static boolean isOdd(int index){
        return index%2 == 0;
    }

    private static boolean isPicked(){
        Random rand = new Random();

        return (rand.nextInt()%5) == 0;
    }

    public String getLine() {
        return line;
    }
}