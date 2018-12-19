package cn.zgyt.basic.dao;

import cn.zgyt.basic.bean.Dictionary;
import cn.zgyt.basic.bean.DictionaryQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictionaryDao {
    int countByExample(DictionaryQuery example);

    int deleteByExample(DictionaryQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dictionary record);

    int insertSelective(Dictionary record);

    List<Dictionary> selectByExample(DictionaryQuery example);

    Dictionary selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dictionary record, @Param("example") DictionaryQuery example);

    int updateByExample(@Param("record") Dictionary record, @Param("example") DictionaryQuery example);

    int updateByPrimaryKeySelective(Dictionary record);

    int updateByPrimaryKey(Dictionary record);
}