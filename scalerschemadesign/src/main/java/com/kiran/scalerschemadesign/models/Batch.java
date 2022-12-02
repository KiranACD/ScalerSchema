package com.kiran.scalerschemadesign.models;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Batch extends BaseModel {
    private String name;
    @ManyToMany
    private List<Student> students;
    @ManyToOne
    private Student batchRepresentative;
    
}
