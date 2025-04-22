package com.xworkz.encapsulation.telegram;

public class TelegramRunner {

    public static void main(String[] args) {

        TelegramUserDto telegramDto = new TelegramUserDto();
        telegramDto.setUserName("John Doe");
        telegramDto.setPhoneNumber("1234567890");
        telegramDto.setEmail("john.doe@telegram.com");
        telegramDto.setBio("Tech Enthusiast");
        telegramDto.setLastSeen("Online");

        System.out.println(telegramDto);
    }
}
