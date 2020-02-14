package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {
    @NotBlank(message = "Description is blank")
    @Size(min=3, max=250, message = "The description should be between 3 and 250 characters")
    private String description;

    public Skill(String aDescription){
        this.description = aDescription;
    }

    public Skill (){}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}