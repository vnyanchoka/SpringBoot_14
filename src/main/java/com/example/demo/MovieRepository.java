package com.example.demo;

import org.springframework.data.repository.CrudRepository;
public interface MovieRepository extends CrudRepository<Director, Long>{
}
