package ua.od.atomspace;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = -7955592698350794298L;// поле для сохранения состояния членов класса
    // при изменении (добавления полей, методов) класса надо менять сериалВешнЮАЙДИ, ибо может возникнуть ситуация, когда
    // был записан один объект в файл, но прошло время и класс был модифицирован
    // и объекты получаются двух разных классов, и поэтому нельзя присвоить ссылкам типа Person нового класса объекты старого
    private int id;
    private String name;
    private transient String surname;// поля с таким кл словом не попадут в файл

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name;
    }
}
