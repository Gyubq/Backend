package org.scoula.ex05;

import org.scoula.ex05.domain.Member;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// MIME 타입 설정
        String userid= request.getParameter("userid");
        String passwd= request.getParameter("passwd");

        request.setAttribute("userid", userid);
        request.setAttribute("passwd", passwd);


        HttpSession session = request.getSession();
        Member member = new Member("홍길동", "hong");
        request.setAttribute("member", "member");

        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        doGet(request, response);
    }
}
