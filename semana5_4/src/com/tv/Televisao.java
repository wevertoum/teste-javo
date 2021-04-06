package com.tv;

public class Televisao {

    Integer volume;
    Integer canal;

    Televisao(){
        this.volume = 0;
        this.canal = 0;
    }

    public String exibeDados() {
        return "Volume: " + volume + " | Canal: " + canal  ;
    }

    public void aumentaVolume() {
        this.volume = volume + 1;
    }

    public void diminuiVolume() {
        if(volume > 0) {
            this.volume = volume - 1;
        }
    }

    public void sobeCanal() {
        this.canal = canal + 1;
    }

    public void desceCanal() {
        if(canal > 0) {
            this.canal = canal - 1;
        }
    }
}
