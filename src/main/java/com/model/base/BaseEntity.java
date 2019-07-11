package com.model.base;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@MappedSuperclass
@Data
public abstract class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Pid")
    private  int id;
}
