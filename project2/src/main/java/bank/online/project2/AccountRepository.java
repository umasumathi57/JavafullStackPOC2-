package bank.online.project2;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>  
{
	//HQL --- Hibernate Query Language.
	// SQL--- ("select *from table where custpmer_id and password")
	@Query("from Account where customerId=:cust and password=:pass")
	public Account findAccountByValidation(long cust, String pass);
}
