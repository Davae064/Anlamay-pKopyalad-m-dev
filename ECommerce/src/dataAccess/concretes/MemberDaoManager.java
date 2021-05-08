package dataAccess.concretes;

import Entitiys.concretes.Member;
import dataAccess.abstracts.MemberDao;

public class MemberDaoManager implements MemberDao{

	@Override
	public void add(Member member) {
		System.out.println(" DB eklendi :" + member.getName());
		
	}

}
