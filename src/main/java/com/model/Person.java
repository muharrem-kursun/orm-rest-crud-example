package com.model;

import com.model.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "person")
public class Person extends BaseEntity {

    @Column(name = "Pad")
    private String ad;
    @Column(name = "Psoyad")
    private String soyad;
}
