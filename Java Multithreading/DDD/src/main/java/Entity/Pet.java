package Entity;

import ValueObject.MedicalRecord;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    private Owner owner;
    private String name;
    private int age;
    private String breed;
    private Doctor doctor;
    private final List<MedicalRecord> medicalRecordList = new ArrayList<>();

}
