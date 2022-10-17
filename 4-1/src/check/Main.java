package check;

import constants.Constants;

public class Main {

  private static String firstName = "夏目";
  private static String lastName = "拓弥";


  
  private static void printName(String firstName, String lastName){
      System.out.println(firstName +lastName);
  }
 
  public static void main(String[] args) {
    printName(firstName,lastName);
    
    Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
    pet.introduce();
    RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
    robotPet.introduce();
 }
}
