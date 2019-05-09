package com.adaming.entitties;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;


@Entity //donne l'accès à la classe au JPA repository
@Table (name="UtilisateurGit")
public class Utilisateur implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	
	@ManyToMany (fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
	@JoinTable (name = "Profil",
	joinColumns = @JoinColumn (name="id", referencedColumnName="id"),
	inverseJoinColumns = @JoinColumn (name="idRole", table = "role", referencedColumnName="idRole"))
	private Set<Role> roles = new HashSet<>();

	
	
	public Utilisateur() {
		super();
	}
	
	public Utilisateur(String nom, String prenom, Set<Role> roles) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.roles = roles;
	}
	
	public Utilisateur(Long id, String nom, String prenom, Set<Role> roles) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.roles = roles;
	}
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
		
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	
	
	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", roles=" + roles + "]";
	}
	
}
