package com.adaming.service;

import java.util.List;

import com.adaming.entitties.Utilisateur;

public interface IUtilisateurService {
	
	public Utilisateur save (Utilisateur utilisateur);
	
	public void delete (Long id);
	
	public List<Utilisateur> findAll();
	
	public Utilisateur findOne(Long id);
	
}
