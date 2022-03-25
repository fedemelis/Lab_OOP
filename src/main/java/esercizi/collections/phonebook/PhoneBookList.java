package esercizi.collections.phonebook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PhoneBookList implements PhoneBook{
    List<Student> phoneBook = new ArrayList<>();

    public PhoneBookList() {

    }

    @Override
    public Student searchByLastname(String s) {
        for (Student std : phoneBook){
            if (std.getLastname() == s){
                return std;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String s) {
        for (Student std : phoneBook){
            if (std.getPhone() == s){
                return std;
            }
        }
        return null;
    }

    @Override
    public void addPerson(Student s) {
        phoneBook.add(s);
    }

    @Override
    public Student searchByName(String s) {
        for (Student std : phoneBook){
            if (std.getName() == s){
                return std;
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String s) {
        for (Iterator<Student> iter = phoneBook.iterator(); iter.hasNext();){
            if (iter.next().phone == s){
                iter.remove();
            }
        }
    }
}
