package esercizi.collections.phonebook;

import java.util.HashMap;
import java.util.Map;

public class PhoneBookMap implements PhoneBook{

    Map<String, Student> phoneBook = new HashMap<>();

    public PhoneBookMap(){

    }

    @Override
    public Student searchByLastname(String s) {
        for (Student std : phoneBook.values()){
            if (std.lastname == s){
                return std;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String s) {
        return phoneBook.get(s);
    }

    @Override
    public void addPerson(Student s) {
        phoneBook.put(s.phone, s);
    }

    @Override
    public Student searchByName(String s) {
        for (Student std : phoneBook.values()){
            if (std.name == s){
                return std;
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String s) {
        phoneBook.remove(s);
    }
}
