package com.thoughtworks.capability.gtb.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventVo {

  private String id;
  private String name;
  private EventType type;
  @JsonFormat(shape = JsonFormat.Shape.NUMBER)
  private Date time;
  @JsonUnwrapped
  private UserVo user;
}
