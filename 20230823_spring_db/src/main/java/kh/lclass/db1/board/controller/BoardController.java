package kh.lclass.db1.board.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kh.lclass.db1.board.model.service.BoardService;
import kh.lclass.db1.board.model.vo.BoardVo;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/list")
	public ModelAndView list(
			//Model model
			ModelAndView mv) {
		//model.addAttribute("boardList", boardService.selectList());
		mv.addObject("boardList", boardService.selectList());
		mv.setViewName("board/list");
		return mv;
	}
	
	@GetMapping("/get")
	public String get(Model model, @RequestParam int bno) {
		model.addAttribute("boardvo",boardService.selectOne(bno));
		return "board/get";
	} 
	@GetMapping("/insert")
	public String insert() {
		return "board/insert";
	}
	@PostMapping("/insert")
	public String insertDo(BoardVo vo, RedirectAttributes ra,Principal principal) {
		// 절대위치 작성하면 됨.
		String viewPage = "";
		
		String mid = principal.getName();
		
		int result;
		try {
			result = 1;
			if(result < 1) {
				ra.addFlashAttribute("msg", "글등록 실패");
				viewPage = "rdeirect:/board/insert";
			}else {
				ra.addAttribute("msg2","msg2");
				ra.addAttribute("m3","m3");
				ra.addFlashAttribute("msg","글등록 성공");
			}
		} catch (Exception e) {
			// 오류 발생시
			ra.addFlashAttribute("msg", "예기치 못한 상황으로 글등록에 실패했습니다.");
		}
		boardService.insert(vo);
		return viewPage;
	}
	
	// Mybatis부터 try catch문이 없어지면서 오류나오는 상황에 대처를 못함
	// 오류를 통합으로 관리하고싶으면 해당 메소드에 exception 걸어주고 공통 페이지를 만들어준다.
	@ExceptionHandler
	public void e() {
		
	}
}
