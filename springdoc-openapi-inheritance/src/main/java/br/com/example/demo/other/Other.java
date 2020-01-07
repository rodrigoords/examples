package br.com.example.demo.other;

import br.com.example.demo.base.model.BaseModel;
import io.swagger.v3.oas.annotations.media.Schema;

public class Other extends BaseModel {

  @Schema
  private Long id;

  @Schema
  private String age;

  @Schema
  private String phone;

  @Override
  public Long getId() {
    return id;
  }

  @Override
  public void setId(Long id) {
    this.id = id;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}
