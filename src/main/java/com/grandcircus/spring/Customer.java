package com.grandcircus.spring;

/**
 * Created by Megan on 5/8/2017.
 */
public class Customer {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String password;
    private String confirmPassword;
    private String loveCoffee;
    private String otherCoffee;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOtherCoffee() {
        return otherCoffee;
    }

    public void setOtherCoffee(String otherCoffee) {
        this.otherCoffee = otherCoffee;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getLoveCoffee() {
        return loveCoffee;
    }

    public void setLoveCoffee(String loveCoffee) {
        this.loveCoffee = loveCoffee;
    }
}
