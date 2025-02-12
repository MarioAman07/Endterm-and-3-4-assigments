package kz.aitu.oop.endterm.repositories;

import kz.aitu.oop.endterm.enteties.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long> {
}

