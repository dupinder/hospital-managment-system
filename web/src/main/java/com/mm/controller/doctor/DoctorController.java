package com.mm.controller.doctor;

import com.mm.model.Doctor.Doctor;
import com.mm.service.Doctor.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorController {
    @Autowired
    private DoctorService service;


    @GetMapping("/doctors")
    public List<Doctor> getDoctors(){
        return service.getDoctors();
    }


}
