package cn.zgyt.basic.dao;

import cn.zgyt.basic.bean.UserLoginError;
import cn.zgyt.basic.bean.UserLoginErrorQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLoginErrorDao {
    int countByExample(UserLoginErrorQuery example);

    int deleteByExample(UserLoginErrorQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserLoginError record);

    int insertSelective(UserLoginError record);

    List<UserLoginError> selectByExample(UserLoginErrorQuery example);

    UserLoginError selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserLoginError record, @Param("example") UserLoginErrorQuery example);

    int updateByExample(@Param("record") UserLoginError record, @Param("example") UserLoginErrorQuery example);

    int updateByPrimaryKeySelective(UserLoginError record);

    int updateByPrimaryKey(UserLoginError record);
}