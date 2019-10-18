package com.formation.ms2i.tp.banque.repository;

import com.formation.ms2i.tp.banque.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
