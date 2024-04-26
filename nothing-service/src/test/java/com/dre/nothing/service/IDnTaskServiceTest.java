package com.dre.nothing.service;

import cn.hutool.json.JSONUtil;
import com.dre.nothing.api.dto.DnTaskDTO;
import com.dre.nothing.api.service.IDnTaskService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class IDnTaskServiceTest {
    @Resource
    private IDnTaskService dnTaskService;

    @Test
    void save() {
        DnTaskDTO dnTaskDTO = new DnTaskDTO();
        dnTaskDTO.setId(0L);
        dnTaskDTO.setName("");
        dnTaskDTO.setDescription("");
        dnTaskDTO.setParentId(0L);
        dnTaskDTO.setStatus(0);
        dnTaskDTO.setPosition(0);
        dnTaskDTO.setStartTime(new Date());
        dnTaskDTO.setEndTime(new Date());
        dnTaskDTO.setCompleteTime(new Date());

        dnTaskService.save(dnTaskDTO);
    }

    @Test
    void update() {
        DnTaskDTO dnTaskDTO = new DnTaskDTO();
        dnTaskDTO.setId(2L);
        dnTaskDTO.setName("aaa");
        dnTaskDTO.setDescription("");
        dnTaskDTO.setParentId(0L);
        dnTaskDTO.setStatus(0);
        dnTaskDTO.setPosition(0);
        dnTaskDTO.setStartTime(new Date());
        dnTaskDTO.setEndTime(new Date());
        dnTaskDTO.setCompleteTime(new Date());

        dnTaskService.update(dnTaskDTO);
    }

    @Test
    void delete() {
        dnTaskService.delete(1L);
    }

    @Test
    void getById() {
        DnTaskDTO taskDTO = dnTaskService.getById(2L);
        System.out.println(taskDTO);
    }

    @Test
    void queryList() {
        List<DnTaskDTO> dnTaskDTOS = dnTaskService.queryList();
        System.out.println(JSONUtil.toJsonStr(dnTaskDTOS));
    }
}