package bank.online.project2;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Transaction 
{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String type;
	private Date date;
	private double amount;
	@ManyToOne
	private Account account;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", type=" + type + ", date=" + date + ", amount=" + amount + ", account="
				+ account + "]";
	}
	public Transaction(String type, Date date, double amount, Account account) {
		super();
		this.type = type;
		this.date = date;
		this.amount = amount;
		this.account = account;
	}
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
