package com.example.PixelPro.repository;

import com.example.PixelPro.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {

    Member findByEmail(String email);

    int countByEmail(String email);

    Member findByMbnum(int mbnum);
}
