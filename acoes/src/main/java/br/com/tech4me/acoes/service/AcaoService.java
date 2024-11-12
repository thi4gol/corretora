package br.com.tech4me.acoes.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4me.acoes.shared.AcaoCompletoDto;
import br.com.tech4me.acoes.shared.AcaoDto;

public interface AcaoService {
    List<AcaoCompletoDto> obterTodasAcoes();
    Optional<AcaoDto> obterAcaoPorId(String id);
    void excluirAcaoPorId(String id);
    AcaoCompletoDto cadastrarAcao(AcaoCompletoDto dto);
    Optional<AcaoCompletoDto> atualizarAcaoPorId(String id, AcaoCompletoDto dto);
}
