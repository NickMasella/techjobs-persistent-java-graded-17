package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
    @Valid
    @NotBlank(message = "Required field.")
    @Size(max = 250, message = "250 Characters max")
    private String location;
    @Id
    @GeneratedValue
    private int id;
    @OneToMany
    @JoinColumn(name = "employer_id")
    private List<Job> jobs = new ArrayList<>();
    public Employer(String n) {
        this.location = n;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public Employer() {}


    public String getLocation() {
        return location;
    }

}
