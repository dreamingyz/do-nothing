package com.dre.nothing.service.dao.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 任务表
 * </p>
 *
 * @author dreamingyz@163.com
 * @since 2023-10-08
 */
@Getter
@Setter
@TableName("dn_task")
public class DnTask implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;

    private String description;

    private Long parentId;

    private Integer status;

    private Integer position;

    private Date startTime;

    private Date endTime;

    private Date completeTime;

    private Long createdId;

    private Date createdDate;

    private Long updatedId;

    private Date updatedDate;

    @TableLogic
    private Integer isActive;

    private String traceId;


}
