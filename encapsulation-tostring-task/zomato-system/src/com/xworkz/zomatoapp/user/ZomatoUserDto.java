package com.xworkz.zomatoapp.user;

import com.xworkz.zomatoapp.constants.City;
import com.xworkz.zomatoapp.constants.CuisineType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ZomatoUserDto {
    private String name;
    private City city;
    private String phoneNumber;
    private CuisineType favoriteCuisine;

    public String toString(){
        return "ZomatoUserDto : (name : "+this.name+
                " , city : " + this.city +
                " , phoneNumber : " + this.phoneNumber+
                " , favoriteCuisine : " +this.favoriteCuisine+ ") ";
    }


    /*public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setCity(City city) {
        this.city = city;
    }
    public City getCity() {
        return city;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setFavoriteCuisine(CuisineType favoriteCuisine) {
        this.favoriteCuisine = favoriteCuisine;
    }
    public CuisineType getFavoriteCuisine() {
        return favoriteCuisine;
    }*/
}
