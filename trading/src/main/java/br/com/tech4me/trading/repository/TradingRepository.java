package br.com.tech4me.trading.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4me.trading.model.Trading;

public interface TradingRepository extends MongoRepository<Trading,String>{
    
}
