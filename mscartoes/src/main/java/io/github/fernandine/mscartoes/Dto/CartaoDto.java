package io.github.fernandine.mscartoes.Dto;

import io.github.fernandine.mscartoes.domain.BandeiraCartao;
import io.github.fernandine.mscartoes.domain.Cartao;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CartaoDto {

    private String nome;
    private BandeiraCartao bandeira;
    private BigDecimal renda;
    private BigDecimal limite;

    public Cartao toModel() {
        return new Cartao(nome, bandeira, renda, limite);

    }

}
