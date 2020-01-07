package br.com.exaple.demo.base.model;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class BaseModel {

  public abstract Long getId();

  public abstract void setId(Long id);

  private LocalDateTime createdDate;

  private LocalDateTime lastModifiedDate;

  public boolean isNew() {
    return Objects.isNull(this.getId());
  }

  public LocalDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(LocalDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public LocalDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }
}
