package bussiness.abstracts;

import java.util.ArrayList;

import Entitiys.concretes.Member;

public interface MemberService {
	
	public void register(Member member);
	public void login(Member member);
	public ArrayList<Member> getAllMembers();
	
	
}
