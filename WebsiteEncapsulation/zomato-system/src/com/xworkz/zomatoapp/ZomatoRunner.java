package com.xworkz.zomatoapp;

import com.xworkz.zomatoapp.constants.City;
import com.xworkz.zomatoapp.constants.CuisineType;
import com.xworkz.zomatoapp.service.ZomatoService;
import com.xworkz.zomatoapp.user.ZomatoUserDto;

public class ZomatoRunner {
    public static void main(String[] args) {
        ZomatoUserDto user = new ZomatoUserDto();
        user.setName("Shubha");
        user.setCity(City.BANGALORE);
        user.setPhoneNumber("9876543210");
        user.setFavoriteCuisine(CuisineType.SOUTH_INDIAN);


        ZomatoService service = new ZomatoService();
        service.isRegistered(user);
        service.displayZomatoUserDetails();
    }
}
