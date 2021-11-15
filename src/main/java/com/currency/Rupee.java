package com.currency;

public class Rupee {

    private int value;

    public Rupee(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean compareTwoRupees(Rupee rupee){
        if(this.getValue() == rupee.getValue()) return true;
        else return false;
    }

    public Rupee add(Rupee rupee){
        return (new Rupee( this.getValue() + rupee.getValue() ));
    }
}
