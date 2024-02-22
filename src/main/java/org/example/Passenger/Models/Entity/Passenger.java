package org.example.Passenger.Models.Entity;

import java.util.Objects;

public class Passenger  {
    private Long passengerId;
    private String name;
    private int age;
    private String contactInformation;

    @Override
    public String toString() {
        return "Passenger{" +
                "passengerId=" + passengerId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", contactInformation='" + contactInformation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return Objects.equals(passengerId, passenger.passengerId) && Objects.equals(name, passenger.name) && Objects.equals(age, passenger.age) && Objects.equals(contactInformation, passenger.contactInformation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passengerId, name, age, contactInformation);
    }

    public Long getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(Long passengerId) {
        this.passengerId = passengerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }
}
