package vip.epss.dao;

import vip.epss.domain.User;

import java.util.List;


public interface UserMapper {
    public abstract User selectByPrimaryKey(Integer key);
    public abstract List<User> select();
    public abstract Integer insert(User record);
    public abstract Integer delete(Integer key);
    public abstract Integer update(User record);
    //特定应用
    public abstract User selectByUser(User record);//用于登录
    public abstract List<User> selectByUsername(String str);//用于查重
}
