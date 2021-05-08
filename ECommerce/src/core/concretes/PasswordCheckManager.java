package core.concretes;

import Entitiys.concretes.Member;
import core.abstracts.ValidatorService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordCheckManager implements ValidatorService {
	
	String passwordPattern = "^.{6,}$";
	Pattern pattern = Pattern.compile(passwordPattern);
	
	
	

	@Override
	public boolean checker(Member member) {
		Matcher matcher = pattern.matcher(member.getPassword());
		
		if(matcher.matches()) {
			return true;
		}else {
			System.out.println(" Your password must be longer than 6 digits ");
			return false;
		}
	}
}
