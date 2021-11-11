package com.company;

public class Main {

    public static void main(String[] args) {
        Resume resume = new Resume.ResumeBuilder("Mukha", "Anhelina")
                .skills("Java, C#, C++, JavaScript, PHP, HTML/CSS, React...")
                .shortDescription("1234567")
                .languages("Fake address 1234")
                .hasExpirience(false)
                .build();

        System.out.println(resume);
    }
}
