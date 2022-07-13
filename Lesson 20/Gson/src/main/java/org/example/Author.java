package org.example;

public class Author {
    private static long count = 0;
    private long id;
    private String name;
    private String surName;
    private int birthDate;

    public Author(){
        count++;
    }

    public Author(String name, String surName, int birthDate){
        this();
        this.id = count;
        this.name = name;
        this.surName = surName;
        this.birthDate = birthDate;
    }


    public long getId(){
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
