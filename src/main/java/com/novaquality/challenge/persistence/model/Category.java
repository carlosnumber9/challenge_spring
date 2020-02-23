package com.novaquality.challenge.persistence.model;

public class Category {

    public static final Category MANA = new Category();
    public static final Category MONSTER = new Category();
    public static final Category BLESSING = new Category();
    public static final Category CURSE = new Category();

    private Integer value;

    public Category() {
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
