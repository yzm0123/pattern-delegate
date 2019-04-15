package com.gupaoedu.vip.pattern.delegate.mvc;

import com.gupaoedu.vip.pattern.delegate.mvc.controllers.MemberController;
import com.gupaoedu.vip.pattern.delegate.mvc.controllers.OrderController;
import com.gupaoedu.vip.pattern.delegate.mvc.controllers.SystemController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DispatcherServlet extends HttpServlet {

    /**
     * 在这里通过委派完成调度
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doDispatch(req,resp);
    }


    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) {
        String uri = req.getRequestURI();
        String id = req.getParameter("id");

        if("getMemberById".equals(uri)){
            new MemberController().getMemberById(id);
        }else if ("getOrderById".equals(uri)){
            new OrderController().getOrderById(id);
        }else if("logout".equals(uri)){
            new SystemController().logout();
        }else {
            try {
                resp.getWriter().write("404 not found;");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
