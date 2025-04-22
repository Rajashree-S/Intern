package com.xworkz.encapsulation.zee5;

public class Zee5Runner {

    public static void main(String[] args) {

        Zee5UserDto zee5Dto = new Zee5UserDto();
        zee5Dto.setUserName("Meera Rai");
        zee5Dto.setEmail("meera.rai@zee5.com");
        zee5Dto.setPhoneNumber("8889997777");
        zee5Dto.setSubscriptionPlan("Premium");
        zee5Dto.setFavoriteShows("Kumkum Bhagya, Tanu Weds Manu");

        System.out.println(zee5Dto);
    }
}
