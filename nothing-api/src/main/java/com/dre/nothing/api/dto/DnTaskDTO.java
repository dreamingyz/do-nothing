package com.dre.nothing.api.dto;

import lombok.Data;

import java.util.Date;

@Data
public class DnTaskDTO {

    private Long id;

    private String name;

    private String description;

    private Long parentId;

    private Integer status;

    private Integer position;

    private Date startTime;

    private Date endTime;

    private Date completeTime;
}
