package cn.zgyt.basic.dao;

import cn.zgyt.basic.bean.VisitInfo;
import cn.zgyt.basic.bean.VisitInfoQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VisitInfoDao {
    int countByExample(VisitInfoQuery example);

    int deleteByExample(VisitInfoQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(VisitInfo record);

    int insertSelective(VisitInfo record);

    List<VisitInfo> selectByExample(VisitInfoQuery example);

    VisitInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VisitInfo record, @Param("example") VisitInfoQuery example);

    int updateByExample(@Param("record") VisitInfo record, @Param("example") VisitInfoQuery example);

    int updateByPrimaryKeySelective(VisitInfo record);

    int updateByPrimaryKey(VisitInfo record);
}