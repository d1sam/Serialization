package ua.od.atomspace;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) {
        Person p1 = new Person(1,"Bob");
        Person p2 = new Person(2,"Mike");

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream ous = new ObjectOutputStream(fos);

            ous.writeObject(p1);
            ous.writeObject(p2);

            ous.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
