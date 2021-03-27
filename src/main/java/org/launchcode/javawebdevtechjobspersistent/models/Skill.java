package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @Size(min = 1, max = 250)
    @NotNull
    private String description;

    public String getDescription() {
        return description;
    }
//SOMETHING IS WRONG WITH SKILLS FORM - WON'T SUBMIT INFO
    public Skill(){}
}