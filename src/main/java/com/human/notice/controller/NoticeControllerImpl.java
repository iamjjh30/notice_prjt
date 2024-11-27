package com.human.notice.controller;

import com.human.notice.NoticeApplication;
import com.human.notice.service.NoticeService;
import com.human.notice.vo.NoticeVO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller("noticeController")
public class NoticeControllerImpl implements NoticeController{

    @Autowired
    private NoticeService NoticeService;

    @Autowired
    private NoticeVO NoticeVO;

    @Override
    @GetMapping("/code/notice_list.do")
    public ModelAndView listNoticeGroup(HttpServletRequest request, HttpServletResponse response) throws Exception {

        List codeGroupList = NoticeService.listNoticeGroup();
        ModelAndView mav = new ModelAndView("/notice/listNoticeGroup");
        mav.addObject("codeGroupList", codeGroupList);
        return mav;
    }
}