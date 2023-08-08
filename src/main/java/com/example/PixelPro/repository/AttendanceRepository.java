package com.example.PixelPro.repository;

import com.example.PixelPro.entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AttendanceRepository extends JpaRepository<Attendance, Integer> {
    List<Attendance> findByMbnum(int mbnum);
}
