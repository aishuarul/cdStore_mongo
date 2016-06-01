package com.ottawau.cdstore.orderProcessing.DAO;

import java.math.BigDecimal;

import org.hibernate.Query;

import com.ottawau.cdstore.orderProcessing.entity.Member;
import com.ottawau.cdstore.orderProcessing.util.HibernateUtil;

public class MemberDAOImpl extends GenericDAOImpl<Member, BigDecimal> implements IMemberDAO {

	public int isLoginSuccess(String username, String password) {
		Member member = new Member();
		
		String sql = "FROM Member as m  WHERE  m.username like '"+username+"' and m.password like '"+password+"' ";
		System.out.println(sql);
        Query query = HibernateUtil.getSession().createQuery(sql);
		member = findOne(query);
		
		if(member == null){
			System.out.println("NUll");
			return 0;
		}
			
		else{
			System.out.println(member.getFirstName()+"  "+member.getLastName());
			return member.getId();
		}
	}	
		public int registerUser(String username, String password, String email) {
			Member member = new Member();
			
			String sql = "insert into Member(username, password, email)";
			System.out.println(sql);
	        Query query = HibernateUtil.getSession().createQuery(sql);
		//	member = save(query);
			return 1;
	}

}
