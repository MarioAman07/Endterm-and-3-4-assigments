package kz.aitu.oop.endterm.controllers;

import kz.aitu.oop.endterm.enteties.Hospital;
import kz.aitu.oop.endterm.repositories.HospitalRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hospitals")
public class HospitalController {
    private final HospitalRepository hospitalRepository;

    public HospitalController(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }

    @GetMapping
    public List<Hospital> getAllHospitals() {
        return hospitalRepository.findAll();
    }

    @PostMapping
    public Hospital addHospital(@RequestBody Hospital hospital) {
        return hospitalRepository.save(hospital);
    }

    @PutMapping("/{id}")
    public Hospital updateHospital(@PathVariable Long id, @RequestBody Hospital hospitalDetails) {
        Hospital hospital = hospitalRepository.findById(id).orElseThrow();
        hospital.setName(hospitalDetails.getName());
        hospital.setLocation(hospitalDetails.getLocation());
        return hospitalRepository.save(hospital);
    }

    @DeleteMapping("/{id}")
    public void deleteHospital(@PathVariable Long id) {
        hospitalRepository.deleteById(id);
    }
}
//comment