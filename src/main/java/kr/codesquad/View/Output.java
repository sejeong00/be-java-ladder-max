package kr.codesquad.View;

public class Output {

    public static void printInputPlayerQuestion(){
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 5글자 이하여하합니다, 이름은 쉼표(,)로 구분하세요)");
    }
    public static void printInputNumberOfPlayerQuestion(){
        System.out.println("참여할 사람은 몇 명인가요?");
    }

    public static void printInputLadderHeightQuestion(){
        System.out.println("최대 사다리 높이는 몇 개인가요?");
    }

    public static void printPlayerList(String playerList){
        System.out.println(playerList);
    }
    public static void printLadder(String ladderString){
        System.out.println(ladderString);
    }

}
