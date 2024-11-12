package br.com.tech4me.trading.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4me.trading.shared.TradingCompletoDto;
import br.com.tech4me.trading.shared.TradingDto;

public interface TradingService {
    List<TradingCompletoDto> obterTrading();
    Optional<TradingDto> obterTradingPorId(String id);
    void excluirTrading(String id);
    TradingCompletoDto cadatrarTrading(TradingCompletoDto dto);
    Optional<TradingCompletoDto> atualizarTradingPorId(String id, TradingCompletoDto dto);
}
