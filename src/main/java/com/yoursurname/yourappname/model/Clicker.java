package com.yoursurname.yourappname.model;

public class Clicker
{
    private Integer amountOfClicks = 0;

    private static Clicker instance = null;

    private Clicker() {}    // Disabling for getInstance method

    public void increaseAmountOfClicks(int increaseNumber)
    {
        amountOfClicks += increaseNumber;
    }

    public Integer getAmountOfClicks()
    {
        return amountOfClicks;
    }

    /**
     * This ensures its a singleton. You can use that to make sure that all your classes are using the same instance of Clicker
     * @return if its the first call, method will create new object, otherwise it will return existing one
     */
    public static Clicker getInstance()
    {
        if(instance == null)
        {
            instance = new Clicker();
        }
        return instance;
    }
}
