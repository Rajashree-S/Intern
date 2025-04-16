package com.xworkz.inheritance.tool;

import com.xworkz.inheritance.tool.hammer.Hammer;
import com.xworkz.inheritance.tool.tooldetails.Tools;

public class ToolRunner {
    public static void main(String[] args) {
        Tools tool = new Tools();
        tool.toolName();
        tool.toolType();
        tool.toolMaterial();
        tool.toolPurpose();
        tool.toolOrigin();

        Tools tool1 = new Hammer();
        tool1.toolFunction();
        tool1.toolName();
        tool1.toolType();
        tool1.toolMaterial();
        tool1.toolPurpose();

        Hammer hammer = new Hammer();
        hammer.hammerType();
        hammer.hammerWeight();
        hammer.hammerHandleMaterial();
        hammer.hammerUsage();
        hammer.hammerHeadShape();
    }
}
