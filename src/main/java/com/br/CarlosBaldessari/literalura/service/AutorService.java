package com.br.CarlosBaldessari.literalura.service;


import com.br.CarlosBaldessari.literalura.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;


}
