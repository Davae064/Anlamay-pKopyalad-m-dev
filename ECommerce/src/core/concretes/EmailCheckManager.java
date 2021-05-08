package core.concretes;

import core.abstracts.ValidatorService;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Entitiys.concretes.Member;

public class EmailCheckManager implements ValidatorService{
	
	String mailPattern = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	Pattern pattern = Pattern.compile(mailPattern,Pattern.CASE_INSENSITIVE);
	
	
	@Override
	public boolean checker(Member member) {
		Matcher matcher = pattern.matcher(member.geteMail());
		if(matcher.matches()) {
			return true;
		}else {
			System.out.println(" Please enter a valid email address !");
			return false;
		}
	}
	
	

}
