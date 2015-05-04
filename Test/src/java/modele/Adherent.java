/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author MOS
 */
public class Adherent {
    
    private int num;
    private String nom;
    private String prenom;
    private String adrRue;
    private String adrCP;
    private String adrVille;
    private String tel;
    private String mel;

    public Adherent() {
    }

    public Adherent(int num, String nom, String prenom, String adrRue, String adrCP, String adrVille, String tel, String mel) {
        this.num = num;
        this.nom = nom;
        this.prenom = prenom;
        this.adrRue = adrRue;
        this.adrCP = adrCP;
        this.adrVille = adrVille;
        this.tel = tel;
        this.mel = mel;
    }
    
    
    
    
    

    public void setNum(int num) {
        this.num = num;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdrRue(String adrRue) {
        this.adrRue = adrRue;
    }

    public void setAdrCP(String adrCP) {
        this.adrCP = adrCP;
    }

    public void setAdrVille(String adrVille) {
        this.adrVille = adrVille;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setMel(String mel) {
        this.mel = mel;
    }

    public int getNum() {
        return num;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdrRue() {
        return adrRue;
    }

    public String getAdrCP() {
        return adrCP;
    }

    public String getAdrVille() {
        return adrVille;
    }

    public String getTel() {
        return tel;
    }

    public String getMel() {
        return mel;
    }
    
    
}
