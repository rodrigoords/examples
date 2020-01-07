package br.com.example.demo.base.service;

import br.com.example.demo.base.model.BaseModel;
import org.springframework.data.domain.Page;

public abstract class BaseService<T extends BaseModel>{

  public T doPost(T t) {
    return t;
  }

  public T findById(Long id){
    return null;
  }

  public void delete(T t) {}

  public Page<T> findAll(Long id){
    return null;
  }
}

