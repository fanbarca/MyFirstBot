package AmabiliaPackage;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


public class Main {
    public static final String LOGTAG = "AmabiliaLog";

    public static void main(String[] args) {

        ApiContextInitializer.init();

        TelegramBotsApi botsApi = new TelegramBotsApi();
        try {
            botsApi.registerBot(new AmabiliaBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}