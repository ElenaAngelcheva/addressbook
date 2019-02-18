package ru.rt.client;

public class Name {
    private final String first;
    private final String middle;
    private final String last;
    private final String nick;

    public Name(String first, String middle, String last, String nick) {
        this.first = first;
        this.middle = middle;
        this.last = last;
        this.nick = nick;
    }

    public String getFirst() {
        return first;
    }

    public String getMiddle() {
        return middle;
    }

    public String getLast() {
        return last;
    }

    public String getNick() {
        return nick;
    }
}
