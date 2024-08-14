package org.scoula.ex05;

import org.scoula.ex05.domain.Member;

import java.io.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/scope")
public class ScopeServlet extends HttpServlet {
    ServletContext sc;

    @Override
    public void init(ServletConfig config) throws ServletException {
        sc = config.getServletContext();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// MIME 타입 설정

        sc.setAttribute("scopeName", "applicationScope 값");

        HttpSession session = request.getSession();
        session.setAttribute("scopeName", "sessionScope 값");
        request.setAttribute("scopeName", "requestScope 값");

        Member member = new Member("홍길동", "hong");
        request.setAttribute("member", member);

        request.getRequestDispatcher("scope.jsp").forward(request, response);

        response.setContentType("text/html;charset=UTF-8");
    }
}
