package com.onion.service.Impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.onion.entity.SysUser;
import com.onion.mapper.SysUserMapper;
import com.onion.service.ISysUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhongmc on 2017/5/4.
 * 用户serivice实现类
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    public SysUser selectUserByUsername(String username) {
        return sysUserMapper.selectUserByUsername(username);
    }
}
