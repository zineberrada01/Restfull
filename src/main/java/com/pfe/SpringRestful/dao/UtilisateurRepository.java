package com.pfe.SpringRestful.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfe.SpringRestful.model.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {
	
	Utilisateur findByUsername(String username);

}
