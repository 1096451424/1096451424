package com.ldj.service.impl;

import com.ldj.entity.T1;
import com.ldj.mapper.T1Mapper;
import com.ldj.service.IT1Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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


    @Resource
    @Qualifier("redisTemplate")
    private RedisTemplate template;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public void test(){
        T1 t1 = new T1();
        t1.setA("1");
        t1.setB("1.1");
        t1.setC("1.2");
        t1.setD("1.3");
        save(t1);
    }

    @Override
    public void saveRedis(String str) {
//        redisTemplate.opsForValue().set("username","3333");
//        stringRedisTemplate.opsForValue().set("ldj",str);
        template.delete("username");
    }

    @Override
    public String getValue() {
//        String username = redisTemplate.opsForValue().get("username").toString();
//        String username = stringRedisTemplate.opsForValue().get("ldj");
//        System.out.println(username);
        return null;
    }


}
