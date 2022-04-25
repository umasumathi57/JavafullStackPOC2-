package bank.online.project2;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import org.springframework.lang.Nullable;

@Entity
public class Account 
{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long accountNo;
	 private String accountHolder;
	 private double accountBalance;
	 private long contactNo;
	 
	 private String password;
	 public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String emailId;
	 @Column(unique =true)
	 private long customerId;
	 @Nullable
	 @OneToMany
	 @JoinTable(name="EveryRecord",joinColumns=@JoinColumn(name="AccountNo"),inverseJoinColumns=@JoinColumn(name="TransactionId"))
	 private Collection<Transaction> mytrans=new ArrayList<Transaction>();
	 
	 
	 
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public Collection<Transaction> getMytrans() {
		return mytrans;
	}
	public void setMytrans(Collection<Transaction> mytrans) {
		this.mytrans = mytrans;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountHolder=" + accountHolder + ", accountBalance="
				+ accountBalance + ", contactNo=" + contactNo + ", emailId=" + emailId + ", customerId=" + customerId
				+ ", mytrans=" + mytrans + "]";
	}
	
	public Account(String accountHolder, double accountBalance, long contactNo, String password, String emailId,
			long customerId, Collection<Transaction> mytrans) {
		super();
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
		this.contactNo = contactNo;
		this.password = password;
		this.emailId = emailId;
		this.customerId = customerId;
		this.mytrans = mytrans;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
}

