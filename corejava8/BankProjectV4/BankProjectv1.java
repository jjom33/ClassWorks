package corejava8.BankProjectV4;

public class BankProjectv1 {
    public static void main(String[] args){
    
        ChatBot chatbot = new ChatBot(new AuthenticationClass());
        chatbot.authentication();
        chatbot.setBankServiceForChatBot();
        chatbot.chatBotStart();
}
}
