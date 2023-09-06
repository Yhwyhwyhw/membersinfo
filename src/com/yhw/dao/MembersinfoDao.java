package com.yhw.dao;

import com.yhw.pojo.Membersinfo;

import java.util.List;


public interface MembersinfoDao {
    List<Membersinfo> selectAll();
    int delete(Membersinfo membersinfo);
}
