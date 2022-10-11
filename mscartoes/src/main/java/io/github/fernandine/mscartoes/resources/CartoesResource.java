package io.github.fernandine.mscartoes.resources;

import io.github.fernandine.mscartoes.Dto.CartaoDto;
import io.github.fernandine.mscartoes.Dto.CartoesPorClienteResponse;
import io.github.fernandine.mscartoes.domain.Cartao;
import io.github.fernandine.mscartoes.domain.ClienteCartao;
import io.github.fernandine.mscartoes.services.CartaoService;
import io.github.fernandine.mscartoes.services.ClienteCartaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("cartoes")
@RequiredArgsConstructor
public class CartoesResource {

    private final CartaoService service;
    private final ClienteCartaoService clienteCartaoService;

    @GetMapping
    public String status() {
        return "ok";
    }

    @PostMapping
    public ResponseEntity cadastra(@RequestBody CartaoDto request) {
        Cartao cartao = request.toModel();
        service.save(cartao);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping(params = "renda")
    public ResponseEntity<List<Cartao>> getCartoesRendaAteh(@RequestParam("renda") Long renda) {
        List<Cartao> list = service.getCartoesRendaMenorIgual(renda);
        return ResponseEntity.ok(list);
    }

    @GetMapping(params = "cpf")
    public ResponseEntity<List<CartoesPorClienteResponse>> getCartoesByCliente(@RequestParam("cpf") String cpf) {
       List<ClienteCartao> lista = clienteCartaoService.listCartoesByCpf(cpf);
       List<CartoesPorClienteResponse> resultList = lista.stream()
               .map(CartoesPorClienteResponse::fromModel)
               .collect(Collectors.toList());
       return ResponseEntity.ok(resultList);
    }


}
