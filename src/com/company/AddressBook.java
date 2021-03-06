package com.company;

import java.util.ArrayList;
import java.util.Scanner;


class personDetail {
    private String firstName, lastName, address, city, state, email;
    long zip, phone;

    /* creating the constructor of the class
    passing Parameter to the constructor
    */
    public personDetail(String firstName, String lastName, String address, String city, String state, String email, long zip, long phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.zip = zip;
        this.phone = phone;
    }

    /* get and set method used to access the private variable of the class
    main class use this variable with the class object
    */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getZip() {
        return zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}

public class AddressBook {
    // taking arraylist with class object And it will store the value dynamic
    static ArrayList<personDetail> list = new ArrayList<personDetail>();
    // Iterator<personDetail> iterator=new Iterator<personDetail>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        //creating the PersonDetail class object to add the person detail
        personDetail personDetail = addPerson();
        // person detail object give to the list
        list.add(personDetail);
        System.out.println("Welcome to the AddressBook");
        System.out.print("Enter the choice 1.add 2.edit 3.remove");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                addPerson();
                break;
            case 2:
                editPersonDetail();
                break;
            case 3:
                removePersonDetail();
                break;
        }

    }

    /* addPerson method is to take input from the console
    personDetail given as return type to the method as there are different type of parameter need to return the method
    */
    private static personDetail addPerson() {
        System.out.println("Enter the firstname");
        String firstName = scanner.next();
        System.out.println("Enter the lastname");
        String lastName = scanner.next();
        System.out.println("Enter the address");
        String address = scanner.next();
        System.out.println("Enter the city");
        String city = scanner.next();
        System.out.println("Enter the state");
        String state = scanner.next();
        System.out.println("Enter the email");
        String email = scanner.next();
        System.out.println("Enter the zip");
        long zip = scanner.nextLong();
        System.out.println("Enter the phone of the person");
        long phone = scanner.nextLong();
        personDetail personDetail = new personDetail(firstName, lastName, address, city, state, email, zip, phone);
        return personDetail;
    }

    /* display method is give to display the Person data
    personDetail class object give as the parameter to the Display method
    */
    private static void display(personDetail personDetail) {
        System.out.println("firstname" + personDetail.getFirstName());
        System.out.println("lastname" + personDetail.getLastName());
        System.out.println("address" + personDetail.getAddress());
        System.out.println("city" + personDetail.getCity());
        System.out.println("state" + personDetail.getState());
        System.out.println("email" + personDetail.getEmail());
        System.out.println("zip" + personDetail.getZip());
        System.out.println("phone" + personDetail.getPhone());
    }

    /**
     * editPerson method to edit the person detail
     */
    public static void editPersonDetail() {
        System.out.println("Enter the name to edit the AddressBook");
        String editName = scanner.next();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFirstName().equals(editName)) {
                System.out.print("Enter the below data user need to eit the AddressBook");
                System.out.println("Press 1.firstname 2.lastname 3.address 4.city 5.state 6.email 7.zip 8.phone");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter the firstname");
                        list.get(i).setFirstName(scanner.next());
                        break;
                    case 2:
                        System.out.println("Enter the lastname");
                        list.get(i).setLastName(scanner.next());
                        break;
                    case 3:
                        System.out.println("Enter the address");
                        list.get(i).setAddress(scanner.next());
                        break;
                    case 4:
                        System.out.println("Enter the city");
                        list.get(i).setCity(scanner.next());
                        break;
                    case 5:
                        System.out.println("Enter the state");
                        list.get(i).setState(scanner.next());
                        break;
                    case 6:
                        System.out.println("Enter the email");
                        list.get(i).setEmail(scanner.next());
                        break;
                    case 7:
                        System.out.println("Enter the zip");
                        list.get(i).setZip(scanner.nextInt());
                        break;
                    case 8:
                        System.out.println("Enter the phone");
                        list.get(i).setPhone(scanner.nextInt());
                        break;
                }
            }
        }
    }

    /*
     * removePersonDetail method to remove the person data
     */
    public static void removePersonDetail() {
        System.out.print("Enter the name you want to remove through the AddressBook");
        String choice = scanner.next();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFirstName().equals(choice)) {
                list.remove(i);
            } else {
                System.out.println("Enter the proper choice");
            }
        }

    }

}

