package com.xworkz.inheritance.programmingLanguage;

import com.xworkz.inheritance.programmingLanguage.java.Java;
import com.xworkz.inheritance.programmingLanguage.language.ProgrammingLanguage;

public class ProgrammingRunner {
    public static void main(String[] args) {
        ProgrammingLanguage language = new ProgrammingLanguage();
        language.languageName();
        language.languageType();
        language.languageCreator();
        language.languageYear();
        language.languageParadigm();

        ProgrammingLanguage language1 = new Java();
        language1.languageFunction();
        language1.languageName();
        language1.languageType();
        language1.languageCreator();
        language1.languageYear();

        Java java = new Java();
        java.javaVersion();
        java.javaPlatform();
        java.javaSyntax();
        java.javaUseCases();
        java.javaCompiler();
    }
}
