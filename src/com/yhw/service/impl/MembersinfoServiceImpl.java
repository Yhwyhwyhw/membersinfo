package com.yhw.service.impl;

import com.yhw.dao.MembersinfoDao;
import com.yhw.dao.impl.MembersinfoDaoImpl;
import com.yhw.pojo.Membersinfo;
import com.yhw.service.MembersinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


public class MembersinfoServiceImpl implements MembersinfoService {



    MembersinfoDao membersinfoDao = new MembersinfoDaoImpl();

    @Override
    public List<Membersinfo> selectAll() {
        return membersinfoDao.selectAll();
    }
}
