package corejava8.BankProjectV4;

public interface Authentication {
    public Person authenticate(String id, String password, String personType);
}
