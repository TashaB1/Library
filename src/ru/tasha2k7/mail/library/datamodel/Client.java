package ru.tasha2k7.mail.library.datamodel;

/**
 * Created by Ната on 01.02.2018.
 */
public class Client extends AbstractModel{
    private String fullName;
    private String address;
    private String phoneNumber;
    private String document;

    public Client(String fullName, String address, String phoneNumber, String document) {
        this.fullName = fullName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.document = document;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    @Override
    public String toString() {
        return "Client{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", document='" + document + '\'' +
                '}';
    }
}
