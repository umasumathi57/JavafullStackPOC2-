package bank.online.project2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService 
{	
	@Autowired
	TransactionRepository rep;
}
