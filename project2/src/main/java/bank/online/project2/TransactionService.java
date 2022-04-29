package bank.online.project2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService 
{	
	@Autowired
	TransactionRepository rep;
	
	public List<Transaction> getByAccount(Account account)
	{
		return rep.findAllByAccount(account);
		
	}
}
