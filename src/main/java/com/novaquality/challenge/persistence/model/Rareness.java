package com.novaquality.challenge.persistence.model;

public class Rareness {

    public final Integer COMMON = 2;
    public final Integer RARE = 4;
    public final Integer VERY_RARE = 6;
    public final Integer LIMITED_EDITION = 9;

    public Rareness() {

    }

    private Integer value;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

}
