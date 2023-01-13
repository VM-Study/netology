package ValueObject;

import Entity.Doctor;
import Entity.Owner;
import Entity.Pet;
import java.time.LocalDateTime;

public class MedicalRecord {
    public Pet pet;
    public Owner owner;
    public Doctor doctor;
    public LocalDateTime dateTime;
    public String description;
    public String prescribedMedications;
    public String surgery;
    public String medicalStatus;
}
