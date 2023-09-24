package com.finzly.BBCUserSide.utility;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.finzly.BBCUserSide.dao.CardDetailsDao;
import com.finzly.BBCUserSide.entity.CardDetails;

@Component
public class ValidCardDetails
{
    
	@Autowired
	CardDetailsDao cardDetailsdao;
	
	public String validCardDetails(CardDetails cardDetails)
	{
		long cardNumber = cardDetails.getCardNumber();
		long cvvNumber = cardDetails.getCVVNumber();
		LocalDate expiryDate = cardDetails.getExpiryDate();
		double balance = cardDetails.getBalance();
		
		CardDetails existingCardDetail = cardDetailsdao.cardCheck(cardNumber);
		
		if(existingCardDetail==null)
		{
			return "Not Valid Card";
		}
		else if(existingCardDetail.getBalance()<balance)
		{
			return "Insufficient Balance...";
		}
		else if(existingCardDetail.getCVVNumber()!=cvvNumber)
		{
			return "CVV Number is not Matching... ";
		}
		else if(!existingCardDetail.getExpiryDate().isEqual(expiryDate)){
			return "Invalid expiry date";
		}
		
		
		return "Valid user";
		
	}
}
