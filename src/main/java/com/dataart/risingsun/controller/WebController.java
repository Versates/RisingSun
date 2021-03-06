package com.dataart.risingsun.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dataart.risingsun.enums.ArticleSelection;
import com.dataart.risingsun.model.Article;
import com.dataart.risingsun.service.DAOServiceManager;
/**
 * 
 * @author kapitoha
 *
 */
@Controller
public class WebController {
    
    @RequestMapping("/adminpanel")
    public ModelAndView adminPage()
    {
	ModelAndView view = new ModelAndView();
	return view;
    }
    
    @RequestMapping("/home")
    public ModelAndView indexPage()
    {
	ModelAndView view = new ModelAndView();
	List<Article> list = DAOServiceManager.getArticleList(ArticleSelection.ALL);//Temporally ALL
	view.addObject("article_list", list);
	return view;
    }


}
