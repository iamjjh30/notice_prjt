package com.human.notice.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;

public interface NoticeController {

    public ModelAndView listNoticeGroup(HttpServletRequest request, HttpServletResponse response) throws Exception;
}