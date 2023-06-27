package corejava11.BankProjectV6;

public interface Authentication {
    public Person authenticate(String id, String password, int personType);
}
