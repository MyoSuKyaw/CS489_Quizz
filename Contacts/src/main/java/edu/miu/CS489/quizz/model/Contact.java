package edu.miu.CS489.quizz.model;

import java.util.List;
import java.util.Objects;

public class Contact {
    private String firstName;
    private String lastName;
    private String company_name;
    private String job_title;

    private List<Email> emailList;
    private List<Phone> phoneList;

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

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public List<Email> getEmailList() {
        return emailList;
    }

    public void setEmailList(List<Email> emailList) {
        this.emailList = emailList;
    }

    public List<Phone> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<Phone> phoneList) {
        this.phoneList = phoneList;
    }

    public Contact(String firstName, String lastName, String company_name, String job_title, List<Email> emailList, List<Phone> phoneList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company_name = company_name;
        this.job_title = job_title;
        this.emailList = emailList;
        this.phoneList = phoneList;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", company_name='" + company_name + '\'' +
                ", job_title='" + job_title + '\'' +
                ", emailList=" + emailList +
                ", phoneList=" + phoneList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact contact = (Contact) o;
        return Objects.equals(getFirstName(), contact.getFirstName()) && Objects.equals(getLastName(), contact.getLastName()) && Objects.equals(getCompany_name(), contact.getCompany_name()) && Objects.equals(getJob_title(), contact.getJob_title()) && Objects.equals(getPhoneList(), contact.getPhoneList()) && Objects.equals(getEmailList(), contact.getEmailList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getCompany_name(), getJob_title(), getPhoneList(), getEmailList());
    }
}
