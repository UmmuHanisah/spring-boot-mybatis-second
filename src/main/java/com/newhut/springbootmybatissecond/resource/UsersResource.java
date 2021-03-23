package com.newhut.springbootmybatissecond.resource;

import com.newhut.springbootmybatissecond.mapper.UsersMapper;
import com.newhut.springbootmybatissecond.model.Users;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ummu Hanisah
 */
@RestController
@RequestMapping("/rest/users")
public class UsersResource {
    
    private UsersMapper usersMapper;

    public UsersResource(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }
    
    @GetMapping("/all")
    public List<Users> getaAll() {
        return usersMapper.findAll();
    }
}