package com.xworkz.encapsulation.pinterest;

public class PinterestRunner {

    public static void main(String[] args) {

        PinterestUserDto pinterestDto = new PinterestUserDto();
        pinterestDto.setUserName("Sneha Patel");
        pinterestDto.setEmail("sneha.patel@pinterest.com");
        pinterestDto.setPhoneNumber("9988776655");
        pinterestDto.setFavoriteBoards("Home Decor, Fashion");
        pinterestDto.setRecentPins("Spring Outfits, Living Room Ideas");

        System.out.println(pinterestDto);
    }
}
