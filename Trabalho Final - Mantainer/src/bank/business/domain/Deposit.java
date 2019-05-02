package bank.business.domain;

import bank.business.BusinessException;

/**
 * @author Ingrid Nunes
 * 
 */
public class Deposit extends Transaction {
	
	static Integer LIMIT = 100;
	public static enum STATUS { PENDING, REJECTED, ACCEPTED };
	
	private long envelope;
	private STATUS status;

	public Deposit(OperationLocation location, CurrentAccount account,
			long envelope, double amount) {
		super(location, account, amount);
		
		this.envelope = envelope;
		
		 // If deposit created on branch, is accepted else is pending
		this.status = location instanceof Branch ? STATUS.ACCEPTED : STATUS.PENDING;
	}
	
	public void accept() throws BusinessException {
		
		if (getAmount() > LIMIT) {
			getAccount().depositAmount(getAmount());
		}
		
		this.status = STATUS.ACCEPTED;
		}
	
	public void reject() throws BusinessException {
		
		if (getAmount() <= LIMIT) {
			getAccount().withdrawalAmount(getAmount(), false);
		}
			
		this.status = STATUS.REJECTED;
	}
	
	public boolean isPending() {
		return status == STATUS.PENDING;
	}
	
	public STATUS getStatus() {
		return status;
	}

	/**
	 * @return the envelope
	 */
	public long getEnvelope() {
		return envelope;
	}
	
	@Override
	public String toString() {
		return String.format("Envelope: %05d | Conta: %05d | Valor: %05.2f | Status: " + getStatus() + "\n", getEnvelope(), getAccount().getId().getNumber(), getAmount());
	}

}
