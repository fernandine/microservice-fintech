package io.github.fernandine.mscartoes.services;

import io.github.fernandine.mscartoes.domain.Cartao;
import io.github.fernandine.mscartoes.repositories.CartaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CartaoService {

    private final CartaoRepository repository;

    public Cartao save(Cartao cartao) {
        return repository.save(cartao);
    }

    public List<Cartao> getCartoesRendaMenorIgual(Long renda) {
        var rendaBigDecimal = BigDecimal.valueOf(renda);
        return repository.findByRendaLessThanEqual(rendaBigDecimal);
    }


}
