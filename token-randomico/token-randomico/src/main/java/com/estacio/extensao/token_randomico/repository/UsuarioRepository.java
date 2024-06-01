package com.estacio.extensao.token_randomico.repository;

import com.estacio.extensao.token_randomico.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    void deleteByCpf(String cpf);

    Optional<Usuario> findByCpf(String cpf);
}
