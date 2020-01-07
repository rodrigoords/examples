package br.com.example.demo.base.controller;


import br.com.example.demo.base.model.BaseModel;
import br.com.example.demo.base.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping
@CrossOrigin
public abstract class BaseRestController<T extends BaseModel>{

  @Autowired
  private BaseService<T> baseService;

  @GetMapping()
  @ResponseStatus(HttpStatus.OK)
  public Page<T> findAll(T t) {
    return this.baseService.findAll(t.getId());
  }

  @GetMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public T findOne(T t) {
    return this.baseService.findById(t.getId());
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public T save(@Valid @RequestBody T t){
    return this.baseService.doPost(t);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void delete(@Valid @RequestBody T t){
    this.baseService.delete(t);
  }

}
