package com.kiran.scalerschemadesign.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Module extends BaseModel {
    private String name;
    
}
