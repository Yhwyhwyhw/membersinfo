package com.yhw.dao.impl;

import com.yhw.dao.BaseDao;
import com.yhw.dao.MembersinfoDao;
import com.yhw.pojo.Membersinfo;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class MembersinfoDaoImpl extends BaseDao implements MembersinfoDao {

    @Override
    public List<Membersinfo> selectAll() {
        String sql = "select * from membersinfo";
        resultSet = execQuery(sql);
        List<Membersinfo> list = new ArrayList<>();
        try {

            while(resultSet.next()){
                Membersinfo membersinfo = new Membersinfo();
                membersinfo.setId(resultSet.getInt(1));
                membersinfo.setMname(resultSet.getString(2));
                membersinfo.setMgender(resultSet.getString(3));
                membersinfo.setMage(resultSet.getInt(4));
                membersinfo.setMaddress(resultSet.getString(5));
                membersinfo.setMemail(resultSet.getString(6));
                list.add(membersinfo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll();
        }
        return list;
    }
}
