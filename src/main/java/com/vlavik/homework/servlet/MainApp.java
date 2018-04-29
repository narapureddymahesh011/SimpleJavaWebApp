package com.vlavik.homework.servlet;

import com.vlavik.homework.data.ObjectContainer;
import com.vlavik.homework.data.impl.LanguagesContainer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainApp extends HttpServlet {

    private final ObjectContainer collection;

    public MainApp() {
        int collectionSize = 10;
        this.collection = new LanguagesContainer(collectionSize);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("collection", "true".equals(req.getParameter("update"))
                ? collection.getOne()
                : collection.getList());
        req.setAttribute("aa", collection.getSize());
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        collection.postOne();
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) {
        collection.putOne();
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) {
        collection.deleteOne();
    }
}
