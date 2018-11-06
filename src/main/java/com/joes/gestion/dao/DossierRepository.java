package com.joes.gestion.dao;

import com.joes.gestion.entity.Dossier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DossierRepository extends JpaRepository<Dossier,Integer> {

}
