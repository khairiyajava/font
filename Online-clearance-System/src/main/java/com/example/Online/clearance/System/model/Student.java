package com.example.Online.clearance.System.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    public String St_name;
    public String St_years;
    public String enrollment_status;
    public String gender;


}
