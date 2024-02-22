package org.example.Passenger.Models.PassengerDto;

import java.util.Objects;

public class PassengerRequest {
    private Long passengerId;
    private String name;
    private Integer age;
    private String contactInformation;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassengerRequest that = (PassengerRequest) o;
        return Objects.equals(passengerId, that.passengerId) && Objects.equals(name, that.name) && Objects.equals(age, that.age) && Objects.equals(contactInformation, that.contactInformation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passengerId, name, age, contactInformation);
    }

    @Override
    public String toString() {
        return "PassengerRequest{" +
                "passengerId=" + passengerId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", contactInformation='" + contactInformation + '\'' +
                '}';
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