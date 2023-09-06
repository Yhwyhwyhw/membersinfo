package com.yhw.servlet;

import com.yhw.pojo.Membersinfo;
import com.yhw.service.MembersinfoService;
import com.yhw.service.impl.MembersinfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@WebServlet("/membersinfo")
public class MembersinfoServlet extends HttpServlet {


    MembersinfoService membersinfoService = new MembersinfoServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String type = req.getParameter("type");
        System.out.println(membersinfoService);
        if (type==null){
            List<Membersinfo> list = membersinfoService.selectAll();
            System.out.println("查询完了" + list);
            req.setAttribute("list", list);
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }


}
