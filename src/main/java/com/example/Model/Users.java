package com.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Utilisateurs")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "nom")
    private String name;

    @Column(nullable = false, name = "Prenom")
    private String firtName;

    @Column(nullable = false, name = "E-mail", unique = true)
    private String email;

    @Column(nullable = false, name = "MotDePasse")
    private String password;

    @Column(nullable = false, name = "DateDeNaissance")
    private String dateDeNaissance;
}
