package com.br.jirehconfeccoes.TestWithMongo.equations_in_mongo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/equaaco")
public class EquationsMongodbRest {

    private static final Logger LOGGER = LoggerFactory.getLogger(EquationsMongodbRest.class);
    private final EquationsInMongodbService equationsInMongodbService;

    public EquationsMongodbRest(EquationsInMongodbService equationsInMongodbService) {
        this.equationsInMongodbService = equationsInMongodbService;
    }

    @PostMapping("/save")
    public EquationsInMongodb save(@RequestBody EquationsInMongodb equationsInMongodb) {
        LOGGER.info("Enviando requisição para savar a equação inserida");

        return equationsInMongodbService.saveEquation(equationsInMongodb);
    }
}
