package com.demo.superhero.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hero")
public class Hero {

    /**
     * Id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * Name.
     */
    @Column(name = "name", length = 100)
    private String name;

    /**
     * Get id.
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * Set id.
     * @param id id
     */
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * Get name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Set name.
     * @param name name
     */
    public void setName(final String name) {
        this.name = name;
    }
}
