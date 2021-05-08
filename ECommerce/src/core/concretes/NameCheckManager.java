package core.concretes;

import Entitiys.concretes.Member;
import core.abstracts.ValidatorService;

public class NameCheckManager implements ValidatorService {

	@Override
	public boolean checker(Member member) {
		if(member.getName().length()>=2 && member.getLastName().length()>=2) {
			return true;
		}else {
			System.out.println("Your name and lastname must be longer than 2 characters!");
			return false;
		}
	}

}
