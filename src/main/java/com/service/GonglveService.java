package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GonglveEntity;
import java.util.Map;

/**
 * 自驾游攻略 服务类
 * @author 
 * @since 2021-04-02
 */
public interface GonglveService extends IService<GonglveEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}