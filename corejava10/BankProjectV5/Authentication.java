package corejava10.BankProjectV5;

public interface Authentication {
    public Person authenticate(String id, String password, int personType);
}
