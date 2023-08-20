package TNSjava.interthreadcommunication.synchronization;

//Program to demonstrate User Defined Exception class


public class DepositLimitExceedsException extends Exception {

    public DepositLimitExceedsException()
    {
        super("Daily limit of Deposit is exceeded..");
    }
    public DepositLimitExceedsException(String message)
    {
        super(message);
    }
}
