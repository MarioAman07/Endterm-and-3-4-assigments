package kz.aitu.oop.endterm.enteties;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String diagnosis;

    @Column(name = "hospital_id")
    private Long hospitalId; // Связь с госпиталем
}
