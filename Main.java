package com.company;

public class Main {

    public static void main(String[] args) {
        AmericanSocket socket =new SimpleAmericanSocket();
        Radio radio= new Radio();
        EUroSocket eUroSocket=new SocketAdapter(socket);
        radio.listenMusic(eUroSocket);
    }
}
