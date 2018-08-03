package com.lv.mapper;

import com.lv.entity.TicketUseLog;
import com.lv.entity.TicketUseLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TicketUseLogMapper {
    long countByExample(TicketUseLogExample example);

    int deleteByExample(TicketUseLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TicketUseLog record);

    int insertSelective(TicketUseLog record);

    List<TicketUseLog> selectByExample(TicketUseLogExample example);

    TicketUseLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TicketUseLog record, @Param("example") TicketUseLogExample example);

    int updateByExample(@Param("record") TicketUseLog record, @Param("example") TicketUseLogExample example);

    int updateByPrimaryKeySelective(TicketUseLog record);

    int updateByPrimaryKey(TicketUseLog record);
}