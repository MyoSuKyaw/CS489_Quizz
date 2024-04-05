package edu.miu.CS489.quizz.model;

import java.util.Objects;

public class Phone {
    private String phone_number;
    private String label;

    public Phone(){};

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phone_number='" + phone_number + '\'' +
                ", label='" + label + '\'' +
                '}';
    }

    public Phone(String phone_number, String label) {
        this.phone_number = phone_number;
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phone)) return false;
        Phone that = (Phone) o;
        return Objects.equals(getPhone_number(), that.getPhone_number()) && Objects.equals(getLabel(), that.getLabel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPhone_number(), getLabel());
    }

}
