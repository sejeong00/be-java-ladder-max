package kr.codesquad.Domain;

public class PlayerName {
    final String name;

    public PlayerName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
