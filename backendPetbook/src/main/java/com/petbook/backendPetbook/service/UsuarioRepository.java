package com.petbook.backendPetbook.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petbook.backendPetbook.models.Usuarios;

public interface UsuarioRepository extends JpaRepository<Usuarios, Long>{
	Optional<Usuarios>  findByEmail(String email);
}
