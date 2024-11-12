package br.com.tech4me.acoes.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4me.acoes.model.Acao;

public interface AcaoRepository  extends MongoRepository<Acao, String>{
    
}
