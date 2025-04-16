package com.xworkz.inheritance.rubber;

import com.xworkz.inheritance.rubber.ball.Ball;
import com.xworkz.inheritance.rubber.rubberdetails.Rubber;

public class RubberRunner {
    public static void main(String[] args) {
        Rubber rubber = new Rubber();
        rubber.rubberType();
        rubber.rubberOrigin();
        rubber.rubberUse();
        rubber.rubberDurability();
        rubber.rubberRecyclable();

        Rubber rubber1 = new Ball();
        rubber1.rubberFunction();
        rubber1.rubberType();
        rubber1.rubberOrigin();
        rubber1.rubberUse();
        rubber1.rubberDurability();

        Ball ball = new Ball();
        ball.ballSize();
        ball.ballColor();
        ball.ballType();
        ball.ballWeight();
        ball.ballMaterial();
    }
}
