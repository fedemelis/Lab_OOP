package esercizi.collections.phonebook;

public interface PhoneBook {
    Student searchByLastname(String s);
    Student searchByNumber(String s);
    void addPerson(Student s);
    Student searchByName(String s);
    void deleteByNumber(String s);

}
