package com.estacio.extensao.token_randomico.repository;

import com.estacio.extensao.token_randomico.models.Chave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ChaveRepository extends JpaRepository<Chave, Long> {

    @Modifying
    @Transactional
    @Query("DELETE FROM Chave c WHERE c.token.id = :tokenId")
    void deleteByTokenId(@Param("tokenId") Long tokenId);


    @Query("SELECT c FROM Chave c WHERE c.chaveRandomica = :chaveRandomica")
    Chave findByChaveRandomica(@Param("chaveRandomica") Long chave);
}
