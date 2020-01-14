package com.valkov;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();//initialize the array
    }

    public boolean addNewContact(Contacts contact) { //Method is declared as boolean in order to check if the contact already exists
        if (findContact(contact.getName()) >= 0) {// calls the name of the contact from the Contacts class
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact) {//old contact is the one we're searching for, newContact is the one we're updating with
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + " was not found");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }


    private int findContact(Contacts contact) {
        return this.myContacts.indexOf(contact);//returns an integer showing us the element position
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contacts contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;//returns the array position number, so we can decide to uptdate it when we write the modify method
            }
        }
        return -1;
    }
    public String queryContact(Contacts contact){
        if(findContact(contact)>=0){
            return contact.getName();
        }
        return null;
    }
    public Contacts queryContact(String name){
        int position=findContact(name);
        if(position>=0){
            return this.myContacts.get(position);
        }
        return null;
    }
    public boolean removeContact(Contacts contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + ", was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + ", was deleted.");
        return true;
    }
    public void printContacts(){
        System.out.println("Contact list");
        for(int i=0;i<this.myContacts.size();i++){
            System.out.println((i+1)+"."+this.myContacts.get(i).getName()+"->"+this.myContacts.get(i).getNumber());
        }
    }

}




