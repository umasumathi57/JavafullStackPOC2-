package bank.online.project2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins= "http://localhost:3000")
public class BankController 
{
	@Autowired
	AccountService aserv;
	@Autowired
	TransactionService tserv;
	
	@PostMapping("/login")
	public Account callValid(@RequestParam("cid") long cid, @RequestParam("ps") String ps)
	{
		
		return aserv.getByValid(cid, ps);
	}
	
	
	
	@PostMapping("/newacc")
	public String accountCreate(@RequestBody Account account) 
	{
		Account obj=aserv.savingAccount(account);
		return obj.getAccountNo()+"has opened for"+account.getAccountHolder();
	}
}
