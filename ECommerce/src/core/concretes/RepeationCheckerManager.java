package core.concretes;
import java.util.ArrayList;
import Entitiys.concretes.Member;
import core.abstracts.ValidatorService;

public class RepeationCheckerManager implements ValidatorService{
	private ArrayList<String> mailControlList;
	
	
	public RepeationCheckerManager(ArrayList<String> mailControlList) {
		this.mailControlList = mailControlList;
	}


	@Override
	public boolean checker(Member member) {
		if(this.mailControlList.isEmpty()) {
			System.out.println("E-Mail has been added.");
			this.mailControlList.add(member.geteMail());
			return true;
		}else{
			for(String mail:this.mailControlList) {
				if(mail==member.geteMail()) {
					System.out.println("E-mail has been already in use.");
					return false;
				}
			}
			System.out.println("E-Mail has been added.");
			this.mailControlList.add(member.geteMail());
			return true;
			
		}
		
	}
}
