package com.br.jirehconfeccoes.TestWithMongo.equations_in_mongo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EquationsInMongodbService {

    private static final Logger LOGGER = LoggerFactory.getLogger(EquationsInMongodbService.class);
    private final EquationsInMongodbRepository equationsInMongodbRepository;

    public EquationsInMongodbService(EquationsInMongodbRepository equationsInMongodbRepository) {
        this.equationsInMongodbRepository = equationsInMongodbRepository;
    }

    public EquationsInMongodb saveEquation(EquationsInMongodb equationsInMongodb){
        LOGGER.info("Salvando a equação inserida");

        return equationsInMongodbRepository.save(equationsInMongodb);
    }

    public EquationsInMongodb findByCod(String cod){
        LOGGER.info("Procurando a equação apartir do codigo...." + cod);

        Optional<EquationsInMongodb> equationsInMongodb = equationsInMongodbRepository.findById(cod);

        if (equationsInMongodb.isPresent()){
            return  equationsInMongodb.get();
        }

        throw new IllegalArgumentException("Não foi possivel encontrar uma equação que pertença ao codigo inserido");
    }
}
