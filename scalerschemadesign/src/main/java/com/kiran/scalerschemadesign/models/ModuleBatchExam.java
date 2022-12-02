package com.kiran.scalerschemadesign.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ModuleBatchExam extends BaseModel {
    @ManyToOne
    private ModuleBatch moduleBatch;
    @ManyToOne
    private Exam exam;
    private Date startDate;
    
}
