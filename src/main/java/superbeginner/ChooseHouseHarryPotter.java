package superbeginner;

import java.util.Map;

public class ChooseHouseHarryPotter {
    /*Harry Potter needs help identifying what each house means.

Read a string representing a house and output the following:

if it is "gryffindor", output "bravery";
if it is "hufflepuff", output "loyalty";
if it is "slytherin", output "cunning";
if it is "ravenclaw", output "intellect";
otherwise, output "not a valid house".*/

    //first solution
    /*public static String defineHouse(String hogwartsHouseName) {
        switch(hogwartsHouseName) {
            case "gryffindor":
                return "bravery";
            case "hufflepuff":
                return "loyalty";
            case "slytherin":
                return "cunning";
            case "ravenclaw":
                return "intellect";
            default:
                return "not a valid house";
        }
    }*/

    //second solution
    public static String defineHouse(String hogwartsHouseName) {
    String houseDefinition = Map.of(
            "gryffindor", "bravery",
            "hufflepuff", "loyalty",
            "slytherin", "cunning",
            "ravenclaw", "intellect"
    )
            .getOrDefault(hogwartsHouseName, "not a valid house");
        return houseDefinition;
    }
}