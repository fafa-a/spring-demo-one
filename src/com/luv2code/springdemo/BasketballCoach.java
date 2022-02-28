package com.luv2code.springdemo;

public class BasketballCoach implements Coach {

  @Override
  public String getDailyWorkout() {
    return "Do 20 suicides";
  }

  @Override
  public String getDailyFortune() {
    return "Today is your lucky day!";
  }
}
