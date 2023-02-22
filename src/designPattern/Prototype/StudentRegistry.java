package designPattern.Prototype;

import java.util.HashMap;

public class StudentRegistry {

    private HashMap<String, Student> registry;

    public StudentRegistry() {
        this.registry= new HashMap<>();
    }

    public Student get(String batchName){
        return registry.get(batchName);
    }
    public  void  save(Student s){
        registry.put(s.getBatchName(),s);
    }
}
