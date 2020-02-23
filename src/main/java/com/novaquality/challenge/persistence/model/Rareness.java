package com.novaquality.challenge.persistence.model;

public class Rareness {

    private static final Integer COMMON_RARENESS = 2;
    private static final Integer RARE_RARENESS = 4;
    private static final Integer VERY_RARE_RARENESS = 6;
    private static final Integer LIMITED_EDITION_RARENESS = 9;

    public Rareness(Integer value) {
        this.value = value;
    }

    private Integer value;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }


    public static final Rareness COMMON = new Rareness(COMMON_RARENESS);
    public static final Rareness RARE = new Rareness(RARE_RARENESS);
    public static final Rareness VERY_RARE = new Rareness(VERY_RARE_RARENESS);
    public static final Rareness LIMITED_EDITION = new Rareness(LIMITED_EDITION_RARENESS);
}
