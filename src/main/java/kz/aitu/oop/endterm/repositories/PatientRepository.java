package kz.aitu.oop.endterm.repositories;

import kz.aitu.oop.endterm.enteties.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
