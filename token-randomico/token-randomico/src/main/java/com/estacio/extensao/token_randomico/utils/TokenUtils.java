package com.estacio.extensao.token_randomico.utils;

import com.estacio.extensao.token_randomico.exceptions.ResourceNotFoundException;
import com.estacio.extensao.token_randomico.exceptions.RestBadRequestException;
import com.estacio.extensao.token_randomico.models.Chave;
import com.estacio.extensao.token_randomico.models.RecuperarSenha;
import com.estacio.extensao.token_randomico.models.Token;
import com.estacio.extensao.token_randomico.repository.ChaveRepository;
import com.estacio.extensao.token_randomico.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class TokenUtils {

    @Autowired
    TokenRepository tokenRepository;
    @Autowired
    ChaveRepository chaveRepository;

    @Transactional
    public Token criarTokenEChaves() {
        Token token = new Token();
        token.gerarChaves();
        tokenRepository.save(token);

        List<Chave> chaves = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Chave chave = token.getChaves().get(i);
            chave = chaveRepository.save(chave);
            chaves.add(chave);
        }
        token.setChaves(chaves);
        return token;
    }

    @Transactional
    public Token substituirChaves(Token token) {
        chaveRepository.deleteByTokenId(token.getId());
        tokenRepository.findById(token.getId());

        token.gerarChaves();
        System.out.println(token.getChaves());

        // Salvar as novas chaves no repositório
        List<Chave> chaves = new ArrayList<>();
        for (Chave chave : token.getChaves()) {
            chave = chaveRepository.save(chave);
            chaves.add(chave);
        }

        return token;
    }

    public Chave verificarToken(RecuperarSenha recuperarSenha) throws RestBadRequestException {
        try {
            Chave chave =  chaveRepository.findByChaveRandomica(recuperarSenha.getChave());
            if (!chave.getUsado()) {
               return chave;
           }
        } catch (Exception e){
            throw new ResourceNotFoundException(String.format("Chave %d inválida.", recuperarSenha.getChave()));
        }
        return null;
    }

    public void invalidarChave(Chave chaveUsuario) {
        chaveUsuario.setUsado(true);
        chaveRepository.save(chaveUsuario);
    }
}
