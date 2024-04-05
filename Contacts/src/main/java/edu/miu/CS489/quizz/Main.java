package edu.miu.CS489.quizz;

import com.google.gson.Gson;
import edu.miu.CS489.quizz.model.Contact;
import edu.miu.CS489.quizz.model.Email;
import edu.miu.CS489.quizz.model.Phone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    private static String contactsJSON(List<Contact> contacts){
        contacts.sort(
                Comparator.comparing(Contact::getLastName)
                        .thenComparing(Contact::getLastName).reversed()
        );
        return new Gson().toJson(contacts);
    }
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        List<Phone> p1 = new ArrayList<>();
        p1.add(new Phone("641-233-8769", "Mobile"));
        p1.add(new Phone("211-655-1908", "Home"));
        p1.add(new Phone("344-788-1421", "Work"));

        List<Email> e1 = new ArrayList<>();
        e1.add(new Email("jhon@gmail.com", "Personal"));
        e1.add(new Email("jhon@miu.edu", "School"));
        e1.add(new Email("jhon@global.com", "Job"));

        List<Phone> p2 = new ArrayList<>();
        p2.add(new Phone("641-233-1000", "Mobile"));
        p2.add(new Phone("211-655-2000", "Home"));
        p2.add(new Phone("344-788-3000", "Work"));

        List<Email> e2 = new ArrayList<>();
        e2.add(new Email("jhonnathan@gmail.com", "Personal"));
        e2.add(new Email("jhonnathan@miu.edu", "School"));
        e2.add(new Email("jhonnathan@global.com", "Job"));

        Contact contact = new Contact("John", "Smith", "Global Ltd", "Senior Software Engineer", e1, p1);
        Contact contact2 = new Contact("John", "Nathan", "Global Ltd", "Senior Software Engineer", e2, p2);
        List<Contact> contacts = new ArrayList<>();
        contacts.add(contact);
        contacts.add(contact2);
        //Print a contact with john format
        System.out.println("List of All Employees: ");
        System.out.println(contactsJSON(contacts));

    }
}