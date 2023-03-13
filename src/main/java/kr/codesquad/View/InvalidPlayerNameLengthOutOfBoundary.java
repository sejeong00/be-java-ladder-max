package kr.codesquad.View;

public class InvalidPlayerNameLengthOutOfBoundary extends RuntimeException{
    private static final String message = "5글자보다 큰 이름이 입력되었습니다.";

    public InvalidPlayerNameLengthOutOfBoundary() {
        super(message);
    }
}
