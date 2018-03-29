package io.micro.core;

public class Main {

    public static void main(String[] args) {
        ParserPool.program(args[0]);
        ParserPool.generate();
    }
}
