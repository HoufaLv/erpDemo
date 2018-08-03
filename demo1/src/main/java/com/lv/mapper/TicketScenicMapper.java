package com.lv.mapper;

import com.lv.entity.TicketScenic;
import com.lv.entity.TicketScenicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TicketScenicMapper {
    long countByExample(TicketScenicExample example);

    int deleteByExample(TicketScenicExample example);

    int insert(TicketScenic record);

    int insertSelective(TicketScenic record);

    List<TicketScenic> selectByExample(TicketScenicExample example);

    int updateByExampleSelective(@Param("record") TicketScenic record, @Param("example") TicketScenicExample example);

    int updateByExample(@Param("record") TicketScenic record, @Param("example") TicketScenicExample example);
}