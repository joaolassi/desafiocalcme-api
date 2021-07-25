package com.lassi.desafiocalcme.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lassi.desafiocalcme.api.model.Pessoa;

public interface PessoaRepository extends MongoRepository<Pessoa, String>{

}
