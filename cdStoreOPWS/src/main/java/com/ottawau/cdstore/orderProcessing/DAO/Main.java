package com.ottawau.cdstore.orderProcessing.DAO;

import com.ottawau.cdstore.orderProcessing.entity.Member;

public class Main {

	public static void main(String[] args) {
		MemberDAOImpl obj = new MemberDAOImpl();
		obj.save(new Member("Aishvarya","Arul","aishvarya@gmail.com","abc1234"));
	}

}
