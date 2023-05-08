package creationalDesignPattern.PrototypeAndRegistryDesignPatterns;

import java.util.HashMap;

public class StudentRegistry {
    private HashMap<String, Student> map = new HashMap<>();

    void register(String name, Student student) {
        map.put(name, student);
    }

    Student get(String name) {
        return map.get(name);
    }
}
