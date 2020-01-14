package com.valkov;

public class Contacts {

    private String name;
    private String number;

    public Contacts(String name, String number) {
        this.name = name;
        this.number = number;

    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public static Contacts createContact(String name, String number){//static Method created
                                                                        // so we can create a new contact Record, so we dont have to create another object instance
        return new Contacts(name,number);

        }


}



