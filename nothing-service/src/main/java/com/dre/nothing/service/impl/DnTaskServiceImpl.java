package com.dre.nothing.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollUtil;
import com.dre.nothing.api.dto.DnTaskDTO;
import com.dre.nothing.api.service.IDnTaskService;
import com.dre.nothing.service.dao.domain.DnTask;
import com.dre.nothing.service.manager.DnTaskManager;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class DnTaskServiceImpl implements IDnTaskService {

    @Resource
    private DnTaskManager dnTaskManager;

    @Override
    public void save(DnTaskDTO taskDTO) {
        DnTask dnTask = BeanUtil.copyProperties(taskDTO, DnTask.class);
        dnTaskManager.save(dnTask);
    }

    @Override
    public void update(DnTaskDTO taskDTO) {
        DnTask dnTask = BeanUtil.copyProperties(taskDTO, DnTask.class);
        dnTaskManager.updateById(dnTask);
    }

    @Override
    public void delete(Long id) {
        dnTaskManager.removeById(id);
    }

    @Override
    public DnTaskDTO getById(Long id) {
        DnTask dnTask = dnTaskManager.getById(id);
        return BeanUtil.copyProperties(dnTask, DnTaskDTO.class);
    }

    @Override
    public List<DnTaskDTO> queryList() {
        List<DnTask> list = dnTaskManager.list();
        if (CollUtil.isEmpty(list)) {
            return new ArrayList<>();
        }
        return list.stream().map(k -> BeanUtil.copyProperties(k, DnTaskDTO.class)).collect(Collectors.toList());
    }
}
