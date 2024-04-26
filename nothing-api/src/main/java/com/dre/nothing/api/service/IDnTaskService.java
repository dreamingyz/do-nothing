package com.dre.nothing.api.service;

import com.dre.nothing.api.dto.DnTaskDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * <p>
 * 任务表 服务类
 * </p>
 *
 * @author dreamingyz@163.com
 * @since 2023-10-08
 */
@RequestMapping("/task")
public interface IDnTaskService {

    @PostMapping("/save")
    void save(@RequestBody DnTaskDTO taskDTO);
    @PostMapping("/update")
    void update(@RequestBody DnTaskDTO taskDTO);
    @PostMapping("/delete")
    void delete(Long id);
    @PostMapping("/getById")
    DnTaskDTO getById(Long id);
    @PostMapping("/queryList")
    List<DnTaskDTO> queryList();
}
