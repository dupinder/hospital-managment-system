package com.mm.service.Doctor;

import com.mm.dao.Doctor.DoctorRepository;
import com.mm.mailservice.EmailService;
import com.mm.model.Doctor.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository repository;

    @Autowired
    private EmailService emailService;

    @PostConstruct
    public void initDoctor(){
        repository.saveAll(
                Stream.of(
                        new Doctor(101, "Dupinder", "spec"),
                        new Doctor(102, "Ujjwal", "heart"))
                        .collect(Collectors.toList()));

    }

    public List<Doctor> getDoctors(){
        emailService.sendEmail();
        return repository.findAll();
    }
}
