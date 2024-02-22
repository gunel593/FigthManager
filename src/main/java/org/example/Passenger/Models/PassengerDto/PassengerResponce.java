package org.example.Passenger.Models.PassengerDto;

import java.util.Objects;

public class PassengerResponce {
    private Long passengerId;
    private String name;
    private Integer age;
    private String contactInformation;

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

    @Override
    public String toString() {
        return "PassengerResponce{" +
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
        PassengerResponce that = (PassengerResponce) o;
        return Objects.equals(passengerId, that.passengerId) && Objects.equals(name, that.name) && Objects.equals(age, that.age) && Objects.equals(contactInformation, that.contactInformation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passengerId, name, age, contactInformation);
    }
}
