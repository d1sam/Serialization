package ua.od.atomspace;

import java.io.*;
import java.util.Arrays;

public class ReadArrayOfObjects {
    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("peopleArr.bin"));) {
            // выше трай с ресурсами (try with resources) нужен для открытия какого-то источника данных
            // для того, чтобы потом в теле трая не закрывать (если открывать таким образом, то можно не париться за закрытие)
            int personCount = ois.readInt();
            Person[] peopleArr = new Person[personCount];
            for (int i = 0; i < personCount; i++) {
                peopleArr[i] = (Person) ois.readObject();
            }

            System.out.println(Arrays.toString(peopleArr));
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
