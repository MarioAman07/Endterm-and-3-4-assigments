package kz.aitu.oop.endterm.repositories;

import kz.aitu.oop.endterm.enteties.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
