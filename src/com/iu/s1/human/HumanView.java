package com.iu.s1.human;

import java.util.List;

public class HumanView {
	
	//문자열을 받아서 출력하는 메서드
	
	//한사람의 정보를 출력하는 메서드
	//정보가 있으면 출력, 없으면 정보가 없음 출력
	public void view(HumanDTO humanDTO) {
		
		if(humanDTO != null) {
			System.out.println("Name : "+humanDTO.getName());
			System.out.println("Nick : "+humanDTO.getNick());
			System.out.println("Email : "+humanDTO.getEmail());
			System.out.println("Phone : "+humanDTO.getPhone());
			System.out.println("Birth : "+humanDTO.getBirth());
			//2000년 12월 24일 (수) 
		}else {
			System.out.println("정보가 없다");
		}
		
	}
	
	
	public void view(List<HumanDTO> ar) {
		
		for(int i=0;i<ar.size();i++) {
			HumanDTO humanDTO = ar.get(i);
			System.out.println("Name : "+humanDTO.getName());
			System.out.println("Nick : "+humanDTO.getNick());
			System.out.println("Email : "+humanDTO.getEmail());
			System.out.println("Phone : "+humanDTO.getPhone());
			System.out.println("Birth : "+humanDTO.getBirth());
			
		}
		
	}

}
