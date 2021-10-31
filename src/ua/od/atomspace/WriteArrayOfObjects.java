package ua.od.atomspace;

import java.io.*;

public class WriteArrayOfObjects {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Bobby");
        Person p2 = new Person(2, "Micky");

        Person[] peopleArr = {p1, p2};

        try {
            FileOutputStream fos = new FileOutputStream("peopleArr.bin");
            ObjectOutputStream ous = new ObjectOutputStream(fos);

            ous.writeInt(peopleArr.length);
            for (int i = 0; i < peopleArr.length; i++) {
                ous.writeObject(peopleArr[i]);
            }

            ous.close();//также массив объектов можно записывать одним объектом
            //в этом случае нужно будет считать в массив объектов и закастить тоже к массиву объектов

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
