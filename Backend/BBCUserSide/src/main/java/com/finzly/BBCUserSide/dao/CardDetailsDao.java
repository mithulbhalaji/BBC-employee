package com.finzly.BBCUserSide.dao;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.BBCUserSide.entity.CardDetails;

@Repository
public class CardDetailsDao 
{
    @Autowired
    SessionFactory sf;


	public CardDetails cardCheck(long cardNumber)
	{
		Session session = sf.openSession();
		return session.get(CardDetails.class, cardNumber);
	
	}
}
