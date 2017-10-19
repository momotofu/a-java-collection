package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double currentLiquidTemp = 130;
        boolean wrongTemp = !(currentLiquidTemp >= 180 && currentLiquidTemp <= 160);

        while(wrongTemp) {
            try {
                HotChocolate.drink(currentLiquidTemp);
                wrongTemp = false;
            } catch(TooHotException error) {
                System.out.println("Ouwwee! It's too hot.");
                currentLiquidTemp -= 5;
            } catch(TooColdException error) {
                System.out.println("Spleh! It's too cold.");
                currentLiquidTemp += 5;
            } catch (TemperatureException e) {
                e.printStackTrace();
            }
        }
    }
}
