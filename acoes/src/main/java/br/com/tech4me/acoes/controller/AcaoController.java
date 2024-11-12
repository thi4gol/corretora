package br.com.tech4me.acoes.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.acoes.service.AcaoService;
import br.com.tech4me.acoes.shared.AcaoCompletoDto;
import br.com.tech4me.acoes.shared.AcaoDto;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/acoes")
public class AcaoController {
    @Autowired
    private AcaoService servico;

    @PostMapping
    public ResponseEntity<AcaoCompletoDto> cadastrarAcao(@RequestBody @Valid AcaoCompletoDto acao) {
        return new ResponseEntity<>(servico.cadastrarAcao(acao), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<AcaoCompletoDto>> obterAcoes() {
        return new ResponseEntity<>(servico.obterTodasAcoes(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AcaoDto> obterAcao(@PathVariable String id) {
        Optional<AcaoDto> retorno = servico.obterAcaoPorId(id);

        if (retorno.isPresent()) {
            return new ResponseEntity<>(retorno.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirAcao(@PathVariable String id) {
        servico.excluirAcaoPorId(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AcaoCompletoDto> atualizarAcao(@PathVariable String id, @RequestBody AcaoCompletoDto acao) {
        Optional<AcaoCompletoDto> retorno = servico.atualizarAcaoPorId(id, acao);

        if (retorno.isPresent()) {
            return new ResponseEntity<>(retorno.get(),HttpStatus.ACCEPTED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @GetMapping("/porta")
    public String obterPorta(@Value("${local.server.port}") String porta) {
        return "A instância que respondeu a requisição está rodando na porta" + porta;
    }
}