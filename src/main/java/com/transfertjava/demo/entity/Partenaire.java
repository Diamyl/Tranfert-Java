package com.transfertjava.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Partenaire {
    @Id // Pour de "id" la clée primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-incrémentation de l'id
    private int id;
    private String raisonsociale;
    private String adresse;
    private String ninea;
    private String email;
    private String tel;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaisonsociale() {
        return raisonsociale;
    }

    public void setRaisonsociale(String raisonsociale) {
        this.raisonsociale = raisonsociale;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNinea() {
        return ninea;
    }

    public void setNinea(String ninea) {
        this.ninea = ninea;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
