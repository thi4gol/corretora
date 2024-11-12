package br.com.tech4me.trading.httpClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.tech4me.trading.model.Acao;

@FeignClient("corretora")
public interface CorretoraClient {
    
    @RequestMapping(method = RequestMethod.GET, value="/acoes/{id}")
        Acao obterAcao(@PathVariable String id);
}