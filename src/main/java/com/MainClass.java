package com;

public class MainClass {
    public static void main(String[] args) {

        new Thread(HWServer::begin).start();
        HWClient.begin();

    }
}
