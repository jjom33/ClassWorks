package corejava11.BankProjectV6;

public class BankProject {
    public static void main(String[] args){
    
        ChatBot chatbot = new ChatBot(new AuthenticationClass());
        // chatbot.authentication();
        // chatbot.setBankServiceForChatBot();
        chatbot.chatBotStart();
}
}
