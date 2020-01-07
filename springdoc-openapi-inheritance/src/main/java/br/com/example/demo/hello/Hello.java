package br.com.example.demo.hello;

import br.com.example.demo.base.model.BaseModel;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema
public class Hello extends BaseModel {

  private Long id;

  private String name;

  private String address;

  @Override
  public Long getId() {
    return id;
  }

  @Override
  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
