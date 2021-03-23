package com.newhut.springbootmybatissecond.mapper;

import com.newhut.springbootmybatissecond.model.Users;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 *
 * @author Ummu Hanisah
 */
@Mapper
public interface UsersMapper {

    @Select("select * from users")
    List<Users> findAll();
    
}
