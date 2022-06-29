package com.ldj.service;

import com.ldj.entity.T1;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ldj
 * @since 2022-06-28
 */
public interface IT1Service extends IService<T1> {

    void test();

    void saveRedis(String str);

    String getValue();

}
