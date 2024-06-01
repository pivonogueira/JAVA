package com.estacio.extensao.token_randomico.repository;

import com.estacio.extensao.token_randomico.models.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends JpaRepository<Token, Long> {
}
