package com.kiran.scalerschemadesign.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ModuleBatch extends BaseModel {

    @ManyToOne
    private Module module;
    @ManyToOne
    private Batch batch;
    private Date startDate;
    
}
