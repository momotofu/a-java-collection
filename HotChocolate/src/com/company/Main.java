package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double currentLiquidTemp = 160;

        try {
            HotChocolate.drink(currentLiquidTemp);
        } catch(TooHotException error) {
            System.out.println("Ouwwee! It's too hot.");
            error.printStackTrace();
        } catch(TooColdException error) {
            System.out.println("Spleh! It's too cold.");
            error.printStackTrace();
        } catch (TemperatureException e) {
            e.printStackTrace();
        }
    }
}
