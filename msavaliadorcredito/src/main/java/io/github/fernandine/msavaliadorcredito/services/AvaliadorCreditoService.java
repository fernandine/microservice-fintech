package io.github.fernandine.msavaliadorcredito.services;

import io.github.fernandine.msavaliadorcredito.domain.model.SituacaoCliente;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AvaliadorCreditoService {

    public SituacaoCliente obterSituacaoCliente(String cpf) {
        //obter dados do cliente - MSCLIENTES e obter cartões do cliente - MSCARTOES

    }
}
