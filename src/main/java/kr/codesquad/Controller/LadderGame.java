package kr.codesquad.Controller;

import kr.codesquad.Model.Ladder;
import kr.codesquad.Model.PlayerNameList;
import kr.codesquad.View.Input;
import kr.codesquad.View.Output;

import java.util.Scanner;

public class LadderGame {
    public void run(){
        Ladder ladder;
        Input input = new Input(new Scanner(System.in));
        String allPlayerString;
        PlayerNameList playerNameList;
        int ladderHeight;

        Output.printInputPlayerQuestion();
        allPlayerString = input.inputPlayers();
        playerNameList = new PlayerNameList(allPlayerString);
        Output.printInputLadderHeightQuestion();
        ladderHeight = input.inputLadderHeight();

        ladder = new Ladder(playerNameList.size(), ladderHeight);
        Output.printPlayerList(playerNameList.toString());
        Output.printLadder(ladder.toString());
    }
}
