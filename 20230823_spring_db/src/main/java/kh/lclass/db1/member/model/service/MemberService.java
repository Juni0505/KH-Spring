package kh.lclass.db1.member.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kh.lclass.db1.member.model.dao.MemberDao;
import kh.lclass.db1.member.model.vo.Member;

@Service("memberService")
public class MemberService {
	
	@Autowired
	private MemberDao memberDao;
	
	public List<Member> selectList(){
		return memberDao.selectList();
	}
	
	public Member selectOne(String pk) {
		return memberDao.selectOne(pk);
	}
	
	public int insert(Member vo) {
		return memberDao.insert(vo);
	}
	@Transactional
	public int insertReply(Member vo) {
		// autocommit이 false 상태로 적용
		// 한개라도 DML이 실패하게되면 rollback 처리함.
		memberDao.update(vo);
		return memberDao.insert(vo);
	}
	public int update(Member vo) {
		return memberDao.update(vo);
	}
	
	public int delete(String pk) {
		return memberDao.delete(pk);
	}
}
