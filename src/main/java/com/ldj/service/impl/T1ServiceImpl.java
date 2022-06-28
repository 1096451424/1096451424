package com.ldj.service.impl;

import com.ldj.entity.T1;
import com.ldj.mapper.T1Mapper;
import com.ldj.service.IT1Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ldj
 * @since 2022-06-28
 */
@Service
public class T1ServiceImpl extends ServiceImpl<T1Mapper, T1> implements IT1Service {

    @Override
    public void test(){
        T1 t1 = new T1();
        t1.setA("1");
        t1.setB("1.1");
        t1.setC("1.2");
        t1.setD("1.3");
        save(t1);
    }
}
