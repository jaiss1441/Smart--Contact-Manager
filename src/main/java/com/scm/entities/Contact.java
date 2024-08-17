package com.scm.entities;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Contact {

    @Id
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String picture;
    private String description;
    private Boolean favorite = false;
    private String websiteLink;
    private String LinkedInLink;

    // private List<String> socialLinks = new ArrayList<>();
    @ManyToOne
    private User user;
}
