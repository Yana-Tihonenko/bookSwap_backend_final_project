package de.ait.gr5.bs.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserFilterSearchDTO {

  private Long userId;
  private String multiSearch;
  private Long categoryId;
  private Long languageId;
  private String location;
}
