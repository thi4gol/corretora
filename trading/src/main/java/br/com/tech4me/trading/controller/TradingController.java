package br.com.tech4me.trading.controller;

import java.util.List;
    import java.util.Optional;

    import org.springframework.beans.factory.annotation.Autowired;
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

    import br.com.tech4me.trading.service.TradingService;
    import br.com.tech4me.trading.shared.TradingCompletoDto;
    import br.com.tech4me.trading.shared.TradingDto;
    import jakarta.validation.Valid;

@RestController
@RequestMapping("/tradings")
public class TradingController {
    @Autowired
    private TradingService servico;

    @PostMapping
    public ResponseEntity<TradingCompletoDto> cadastrarTradings(@RequestBody @Valid TradingCompletoDto tradings) {
        return new ResponseEntity<>(servico.cadatrarTrading(tradings), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<TradingCompletoDto>> obterTradings() {
        return new ResponseEntity<>(servico.obterTrading(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TradingDto> obterTradingsPorId(@PathVariable String id) {
        Optional<TradingDto> retorno = servico.obterTradingPorId(id);

        if (retorno.isPresent()) {
            return new ResponseEntity<>(retorno.get(), HttpStatus.FOUND);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void>excluirTradingPorId(@PathVariable String id, @RequestBody TradingCompletoDto tradings) {
        servico.excluirTrading(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TradingCompletoDto> atualizarTrading(@PathVariable String id, @RequestBody TradingCompletoDto tradings){
        Optional<TradingCompletoDto> retorno = servico.atualizarTradingPorId(id, tradings);

        if (retorno.isPresent()) {
            return new ResponseEntity<>(retorno.get(), HttpStatus.ACCEPTED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }
}
