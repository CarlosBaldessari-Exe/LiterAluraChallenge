package com.br.CarlosBaldessari.literalura.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
