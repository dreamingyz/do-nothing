package com.dre.nothing.service.dao.mapper;

import com.dre.nothing.service.dao.domain.DnTask;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class DnTaskMapperTest {

    @Resource
    private DnTaskMapper dnTaskMapper;

    @Test
    public void testInsert() {
        DnTask dnTask = new DnTask();
        dnTask.setId(0L);
        dnTask.setName("");
        dnTask.setDescription("");
        dnTask.setParentId(0L);
        dnTask.setStatus(0);
        dnTask.setPosition(0);
        dnTask.setStartTime(new Date());
        dnTask.setEndTime(new Date());
        dnTask.setCompleteTime(new Date());
        dnTask.setCreatedId(0L);
        dnTask.setCreatedDate(new Date());
        dnTask.setUpdatedId(0L);
        dnTask.setUpdatedDate(new Date());
        dnTask.setIsActive(0);
        dnTask.setTraceId("");
        dnTaskMapper.insert(dnTask);
    }

}