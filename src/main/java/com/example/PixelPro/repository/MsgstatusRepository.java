package com.example.PixelPro.repository;
import com.example.PixelPro.entity.Msgstatus;
import com.example.PixelPro.entity.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface MsgstatusRepository extends JpaRepository<Msgstatus, Integer> {
    @Query(value = "select count(*) from msgstatus where cnum = :cnum and cpnum = :cpnum and isread = 'unread'", nativeQuery = true)
    int countUnread(@Param("cnum") int cnum, @Param("cpnum") int cpnum);
    @Modifying
    @Transactional
    @Query(value = "update msgstatus set isread = :isread where cpnum = :cpnum and cnum = :cnum", nativeQuery = true)
    void setAsRead(@Param("isread") String isread,@Param("cpnum") int cpnum, @Param("cnum") int cnum);
    @Query(value = "select count(*) from msgstatus where cpnum in :participantList and isread = 'unread'", nativeQuery = true)
    int countAllUnread(@Param("participantList") List<Participant> participantList);
}
