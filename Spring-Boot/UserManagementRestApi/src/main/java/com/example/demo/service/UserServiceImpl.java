package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.exception.NotFoundException;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.dto.UserDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService{
    private static ArrayList<User> users = new ArrayList<User>();

    static {
        users.add(new User(1,"thi","thilaquy@gmail.com","0366921214","bolshevik","123456"));
        users.add(new User(2,"trang","tranglax@gmail.com","0123456789","bet","654321"));
        users.add(new User(3,"nhung","nhunglax@gmail.com","0987646272","nung","2000"));
    }

    @Override
    public List<UserDto> getListUser() {
        List<UserDto> result = new ArrayList<UserDto>();
        for (User user : users){
            result.add(UserMapper.toUserDto(user));
        }
        return result;
    }

    @Override
    public UserDto getUserById(int id) {
        for(User user : users){
            if(user.getId() == id){
                return UserMapper.toUserDto(user);
            }
        }
        throw new NotFoundException("user ko ton tai trong he thong.");
    }

    @Override
    public List<UserDto> searhUser(String keyword) {
        List<UserDto> result = new ArrayList<>();
        for(User user : users){
            if(user.getName().contains(keyword)){
                result.add(UserMapper.toUserDto(user));
            }
        }
        return result;
    }
}
