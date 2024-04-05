package edu.miu.CS489.quizz.model;

import java.util.Objects;

public class Email {
    private String email;
    private String label;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Email(String email, String label) {
        this.email = email;
        this.label = label;
    }

    @Override
    public String toString() {
        return "Email{" +
                "email='" + email + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Email)) return false;
        Email that = (Email) o;
        return Objects.equals(getEmail(), that.getEmail()) && Objects.equals(getLabel(), that.getLabel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmail(), getLabel());
    }

}
