package com.universitory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "studentpreference")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentPreference {

    @Column(nullable = false, name = "cycle")
    private String cycle;
}
