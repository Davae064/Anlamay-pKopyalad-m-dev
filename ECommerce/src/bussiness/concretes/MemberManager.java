package bussiness.concretes;

import java.util.ArrayList;

import Entitiys.concretes.Member;
import bussiness.abstracts.MemberService;
import core.abstracts.ValidatorService;
import dataAccess.abstracts.MemberDao;

public class MemberManager implements MemberService{

	private ValidatorService[] validatorServices;
	private MemberDao dataAccess;
	private ArrayList<Member> users;
	
	public MemberManager(ValidatorService[] validatorServices,MemberDao dataAccess,ArrayList<Member> users) {
		this.validatorServices = validatorServices;
		this.dataAccess = dataAccess;
		this.users = users;
		
	}

	@Override
	public void register(Member member) {
		for (ValidatorService validatorService : this.validatorServices) {
			if (validatorService.checker(member)==false) {
				System.out.println("Register is not successful!");
				System.out.println("\n-----------------------------------\n");
				return;
			}
		}
		System.out.println("Verification Code : "+(int)(Math.random()*100000)+"||Verification successfull.");
		this.dataAccess.add(member);
		users.add(member);
		System.out.println("\n-----------------------------------\n");
		
		
	}
	

	@Override
	public void login(Member member) {
		for (Member user : users) {
			if(user.geteMail()==member.geteMail() && user.getPassword()== member.getPassword()) {
				System.out.println("Welcome : "+user.getName()+" "+user.getLastName());
				return;
		    }	
	    }
		System.out.println("Sign in not successful.Please check your email or password.");
	}

	@Override
	public ArrayList<Member> getAllMembers() {
		return this.users;
	}

}
