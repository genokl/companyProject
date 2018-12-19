package cn.zgyt.basic.dao;

import cn.zgyt.basic.bean.UserLoginInfo;
import cn.zgyt.basic.bean.UserLoginInfoQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLoginInfoDao {
    int countByExample(UserLoginInfoQuery example);

    int deleteByExample(UserLoginInfoQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserLoginInfo record);

    int insertSelective(UserLoginInfo record);

    List<UserLoginInfo> selectByExample(UserLoginInfoQuery example);

    UserLoginInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserLoginInfo record, @Param("example") UserLoginInfoQuery example);

    int updateByExample(@Param("record") UserLoginInfo record, @Param("example") UserLoginInfoQuery example);

    int updateByPrimaryKeySelective(UserLoginInfo record);

    int updateByPrimaryKey(UserLoginInfo record);
}