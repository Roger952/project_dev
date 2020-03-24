package com.br.jirehconfeccoes.TestWithMongo.equations_in_mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquationsInMongodbRepository extends MongoRepository<EquationsInMongodb, String> {
}
