package com.kiran.scalerschemadesign.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class StudentModuleBatchExam extends BaseModel {
    @ManyToOne
    private ModuleBatchExam moduleBatchExam;
    @ManyToOne
    private Student student;
    private int marks;
    private boolean attempted;
    private String result;
    
}
