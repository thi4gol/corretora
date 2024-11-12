package br.com.tech4me.acoes.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.acoes.model.Acao;
import br.com.tech4me.acoes.repository.AcaoRepository;
import br.com.tech4me.acoes.shared.AcaoCompletoDto;
import br.com.tech4me.acoes.shared.AcaoDto;

@Service
public class AcaoServiceImpl implements AcaoService{

    @Autowired
    private AcaoRepository repositorio;

    @Override
    public List<AcaoCompletoDto> obterTodasAcoes() {
        List<Acao> acoes = repositorio.findAll();

        return acoes.stream()
                    .map(p -> new ModelMapper().map(p, AcaoCompletoDto.class))
                    .collect(Collectors.toList());
    }

    @Override
    public Optional<AcaoDto> obterAcaoPorId(String id) {
        Optional<Acao> acao = repositorio.findById(id);

        if (acao.isPresent()) {
            return Optional.of(new ModelMapper().map(acao.get(), AcaoDto.class));
        }

        return Optional.empty();
    }

    @Override
    public void excluirAcaoPorId(String id) {
        repositorio.deleteById(id);
    }

    @Override
    public AcaoCompletoDto cadastrarAcao(AcaoCompletoDto dto) {
        Acao acao = new ModelMapper().map(dto, Acao.class);
        repositorio.save(acao);
        return new ModelMapper().map(acao, AcaoCompletoDto.class);
    }

    @Override
    public Optional<AcaoCompletoDto> atualizarAcaoPorId(String id, AcaoCompletoDto dto) {
        Optional<Acao> retorno = repositorio.findById(id);

        if (retorno.isPresent()) {
            Acao acao = new ModelMapper().map(dto, Acao.class);
            acao.setId(id);
            repositorio.save(acao);
            return Optional.of(new ModelMapper().map(acao, AcaoCompletoDto.class));
        } else {
            return Optional.empty();
        }
    }
}