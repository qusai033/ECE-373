package com.example.androidlab_almustafa;

public class Person {
    private String name;
    private String phone;
    private String address;
    private String email;

    public Person(String name,String phone, String address, String email){
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }
    public String getAddress() {
        return this.address;
    }
}
