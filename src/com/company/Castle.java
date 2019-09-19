package com.company;

public class Castle extends Building { // this is our blueprint
    public Castle(){
        System.out.println("Creating a castle...");
    }

    private String gold;
    private String magnaCarta;
    private String princess;

    public String getGold() {
        return gold;
    }

    public void setGold(String gold) {
        this.gold = gold;
    }

    public String getMagnaCarta() {
        return magnaCarta;
    }

    public void setMagnaCarta(String magnaCarta) {
        this.magnaCarta = magnaCarta;
    }

    public String getPrincess() {
        return princess;
    }

    public void setPrincess(String princess) {
        this.princess = princess;
    }

    public void callTheCalvary(){

    }

    public void bringHorse(){

    };

    public void bringShield(){

    };

    public void bringMoreWeapon(){

    };


}
