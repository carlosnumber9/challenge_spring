package com.novaquality.challenge.persistence.model;

public class Rareness {

//    public static final Integer COMMON = 2;
//    public static final Integer RARE = 4;
//    public static final Integer VERY_RARE = 6;
//    public static final Integer LIMITED_EDITION = 9;


    public static final Rareness COMMON = new Rareness();
    public static final Rareness RARE = new Rareness();
    public static final Rareness VERY_RARE = new Rareness();
    public static final Rareness LIMITED_EDITION = new Rareness();

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
