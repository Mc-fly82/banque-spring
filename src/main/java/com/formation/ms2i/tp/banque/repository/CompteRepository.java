package com.formation.ms2i.tp.banque.repository;

import com.formation.ms2i.tp.banque.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CompteRepository extends JpaRepository<Compte, Long> {
}
