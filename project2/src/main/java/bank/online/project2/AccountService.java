package bank.online.project2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService 
{
	@Autowired
	AccountRepository rep;
	
	
	public Account savingAccount(Account account)
	{
		return rep.save(account);
	}
	
}
