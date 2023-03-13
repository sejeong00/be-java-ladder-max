package kr.codesquad.View;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    Scanner sc;

    public Input(Scanner sc) {
        this.sc = sc;
    }

    public String inputPlayerNames(){
        String names = "";

        try {
            names = sc.nextLine();
            validatePlayerNames(names);
        } catch(InvalidPlayerNameLengthOutOfBoundary e){
            System.out.println(e.getMessage());
            Output.printInputPlayerQuestion();
            names = inputPlayerNames();
        }

        return names;
    }

    public void validatePlayerNames(String input){
            Arrays.stream(input.split(","))
                    .forEach(s -> {
                        if (s.length() > 5) {
                            throw new InvalidPlayerNameLengthOutOfBoundary();
                        }
                    });
    }

    public int inputNumberOfPlayers() {
        return sc.nextInt();
    }

    public int inputLadderHeight(){
        return sc.nextInt();
    }
}
