package com.tjj.mpdemo1010.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tjj.mpdemo1010.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
