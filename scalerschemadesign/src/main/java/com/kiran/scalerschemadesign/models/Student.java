package com.kiran.scalerschemadesign.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Student extends BaseModel {
    private String name;
    private String email;
    private String password;
    @OneToMany(mappedBy = "batchRepresentative")
    private List<Batch> classRepresentativeOf;
    @ManyToMany(mappedBy = "students")
    private List<Batch> batches;
    
}
