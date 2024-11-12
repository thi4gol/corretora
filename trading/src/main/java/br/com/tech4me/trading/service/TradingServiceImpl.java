package br.com.tech4me.trading.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.trading.httpClient.CorretoraClient;
import br.com.tech4me.trading.model.Trading;
import br.com.tech4me.trading.repository.TradingRepository;
import br.com.tech4me.trading.shared.TradingCompletoDto;
import br.com.tech4me.trading.shared.TradingDto;

@Service
public class TradingServiceImpl implements TradingService{

    @Autowired
    private TradingRepository repository;

    @Autowired
    private CorretoraClient corretoraClient;

    @Override
    public List<TradingCompletoDto> obterTrading() {
        List<Trading> tradings = repository.findAll();
        List<TradingCompletoDto> dto = tradings.stream().map(p -> new ModelMapper().map(p, TradingCompletoDto.class)).collect(Collectors.toList());
        return dto;
    }

    @Override
    public Optional<TradingDto> obterTradingPorId(String id) {
        Optional<Trading> tradings = repository.findById(id);

        if (tradings.isPresent()) {
            TradingDto tradingComAcao = new ModelMapper().map(tradings, TradingDto.class);
            tradingComAcao.setDadosAcao(corretoraClient.obterAcao(tradingComAcao.getIdAcao()));

            return Optional.of(tradingComAcao);
        } else{
            return Optional.empty();
        }
    }

    @Override
    public void excluirTrading(String id) {
        repository.deleteById(id);
    }

    @Override
    public TradingCompletoDto cadatrarTrading(TradingCompletoDto dto) {
        Trading tradings = new ModelMapper().map(dto, Trading.class);
        repository.save(tradings);
        return new ModelMapper().map(tradings, TradingCompletoDto.class);
    }

    @Override
    public Optional<TradingCompletoDto> atualizarTradingPorId(String id, TradingCompletoDto dto) {
        Optional<Trading> retorno = repository.findById(id);

        if (retorno.isPresent()) {
            Trading tradings = new ModelMapper().map(dto, Trading.class);
            tradings.setId(id);
            repository.save(tradings);
            return Optional.of(new ModelMapper().map(tradings, TradingCompletoDto.class));
        } else {
            return Optional.empty();   
        }
    }
}