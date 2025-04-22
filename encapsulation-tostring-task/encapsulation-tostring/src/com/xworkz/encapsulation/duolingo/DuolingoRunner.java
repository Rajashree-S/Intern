package com.xworkz.encapsulation.duolingo;

public class DuolingoRunner {

    public static void main(String[] args) {

        DuolingoUserDto duoDto = new DuolingoUserDto();
        duoDto.setLearnerName("Riya Mehta");
        duoDto.setSelectedLanguage("Spanish");
        duoDto.setEmail("riya.mehta@duo.com");
        duoDto.setLearningGoal("15 minutes per day");

        System.out.println(duoDto);
    }
}
