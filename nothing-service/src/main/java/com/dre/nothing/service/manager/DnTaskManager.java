package com.dre.nothing.service.manager;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dre.nothing.service.dao.domain.DnTask;
import com.dre.nothing.service.dao.mapper.DnTaskMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 任务表 服务实现类
 * </p>
 *
 * @author dreamingyz@163.com
 * @since 2023-10-08
 */
@Service
public class DnTaskManager extends ServiceImpl<DnTaskMapper, DnTask> {

}
