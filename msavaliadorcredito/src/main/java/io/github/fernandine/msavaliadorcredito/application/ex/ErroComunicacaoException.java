package io.github.fernandine.msavaliadorcredito.application.ex;

import lombok.Getter;
@Getter
public class ErroComunicacaoException extends Exception{
    private Integer status;
    public ErroComunicacaoException(String msg, Integer status) {
        super(msg);
        this.status = status;
    }
}
