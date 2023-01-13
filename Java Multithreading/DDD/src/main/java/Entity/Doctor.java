package Entity;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String specialization;
    private final List<Pet> patientsList = new ArrayList<>();

}
