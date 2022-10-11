package io.github.fernandine.mscartoes.services;

import io.github.fernandine.mscartoes.domain.ClienteCartao;
import io.github.fernandine.mscartoes.repositories.ClienteCartaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteCartaoService {

    private final ClienteCartaoRepository repository;

    public List<ClienteCartao> listCartoesByCpf(String cpf) {
        return repository.findByCpf(cpf);
    }

}
