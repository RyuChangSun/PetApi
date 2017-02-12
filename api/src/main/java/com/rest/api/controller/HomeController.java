package com.rest.api.controller;

import java.text.DateFormat;
import java.util.Date;
//import java.util.HashMap;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	   
//    @Autowired
//    private SqlSession sqlSession;
    
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );

/*		List<HashMap<String, String>> outputs = sqlSession.selectList("userControlMapper.selectSample"); 
		System.out.print(outputs.toString());
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		modelAndView.addObject("result", outputs.toString());*/

	      // view 화면인 main.jsp에 DB로부터 읽어온 데이터를 보여준다.
//        ModelAndView result = new ModelAndView();
        //addObject view에 넘어가는 데이터
/*        List<Member> memberList = memberService.selectAll();
        result.addObject("result", memberList);
        result.setViewName("home");
        return result;*/
        
		return "home";
	}
}
