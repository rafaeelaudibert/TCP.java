package bank.ui.text.command;

import java.util.List;

import bank.business.AccountOperationService;
import bank.business.BusinessException;
import bank.business.domain.Deposit;
import bank.ui.text.BankTextInterface;
import bank.ui.text.UIUtils;

public class CheckPendingCommand extends Command {
	
	private static final Integer EXIT_CODE = 0;
	private static final Integer REJECT = 0;
	private static final Integer ACCEPT = 1;

	private final AccountOperationService accountOperationService;
	
	public CheckPendingCommand(BankTextInterface bankInterface,
	AccountOperationService accountOperationService) {
		super(bankInterface);
		this.accountOperationService = accountOperationService;
		
	}
	
	public void execute() {		
		List<Deposit> pendingDeposits = null;
		Integer index = EXIT_CODE;
		
		
		do{
			// Pega dep�sitos pendentes
			pendingDeposits =  accountOperationService.getPendingDeposits();
			
			if (!pendingDeposits.isEmpty()) {
				System.out.println(getTextManager().getText("pending.init"));
				
				printDeposits(pendingDeposits);
				
				index = UIUtils.INSTANCE.readInteger("pending.selection", 0, pendingDeposits.size());			
				
				if(!index.equals(EXIT_CODE)) {
					Integer option =  UIUtils.INSTANCE.readInteger("pending.option", REJECT, ACCEPT);
					if (option.equals(ACCEPT)) {
						try {
							pendingDeposits.get(index - 1).accept();
							System.out.println(getTextManager().getText("pending.successfull"));
						} catch (BusinessException e) {
							System.out.println(e);
						}
					} else {
						try {
							pendingDeposits.get(index - 1).reject();
							System.out.println(getTextManager().getText("pending.successfull"));
						} catch (BusinessException e) {
							System.out.println(e);
						}
					}
				}
			}
		}
		while(!index.equals(EXIT_CODE) && !pendingDeposits.isEmpty());
		
		if (pendingDeposits.isEmpty()) {
			System.out.println(getTextManager().getText("pending.empty"));
		}
	}
	
	private void printDeposits(List<Deposit> pendingDeposits) {
		for(int i = 0; i < pendingDeposits.size(); i++) {
			System.out.format("%03d -> " + pendingDeposits.get(i), i + 1);
		}
		System.out.println(""); //Blank line
	}
	
}
