package entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idUser;
    private Long idUprawnien;
    private String login;
    private String haslo;

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Long getIdUprawnien() {
        return idUprawnien;
    }

    public void setIdUprawnien(Long idUprawnien) {
        this.idUprawnien = idUprawnien;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    @Override
    public String toString() {
        return "entities.User [idUser=" + idUser + ", login=" + login + " haslo=" + haslo+ "]";
    }

}
