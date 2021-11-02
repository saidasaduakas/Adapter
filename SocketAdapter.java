package com.company;

public class SocketAdapter implements EUroSocket{
    AmericanSocket americanSocket;

    public SocketAdapter(AmericanSocket americanSocket){
        this.americanSocket=americanSocket;
    }

    @Override
    public void getPower(){
        americanSocket.getPower();
    }
}
