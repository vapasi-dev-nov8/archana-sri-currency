package com.currency;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rupee rupee = (Rupee) o;
        return value == rupee.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
