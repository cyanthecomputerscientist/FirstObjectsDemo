package io.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class HumanTest {
    @Test
    public void constructorTest()
    {
        //given (create data were going to use for test)
        String first = "Fred";
        String last = "Flinstone";
        int energy = 50; 
        //when (The actual using of functionality)
        Human testHuman = new Human(first, last);
        String actualFirst = testHuman.getFirst(); 
        String actualLast = testHuman.getLast();
        int actualEnergy = testHuman.getEnergy();
        //then (check if the results match up with test data)
        Assert.assertEquals(first,actualFirst);
        Assert.assertEquals(last, actualLast);
        Assert.assertEquals(energy, actualEnergy);
    }
    @Test 
    public void eatTest()
    {
        //Given
        Fruit pineapple = new Fruit("Pineapple", 10);
        int expectedEnergy = 60; 
        Human testHuman = new Human("Barney","Rubble");
        //When
        testHuman.eat(pineapple);
        int actualEnergy =testHuman.getEnergy();
        //Then
        Assert.assertEquals(expectedEnergy, actualEnergy);
    }

    @Test
    public void workTest()
    {
        //Given
        Human testHuman = new Human ("Wilma", "Flinstone");
        int expectedEnergy = 30; 
        //When 
        testHuman.work(2);
        int actualEnergy= testHuman.getEnergy();
    
        //Then
        Assert.assertEquals(expectedEnergy, actualEnergy);
    }

@Test
public void energyMaxTest () 
{

    //Given
    Human testHuman = new Human("Betty", "Rubble");
    Fruit testfruit1 = new Fruit("Dragonfruit", 20);
    Fruit testfruit2 = new Fruit("Orange", 20);
    Fruit testFruit3 = new Fruit("Apple", 20);    
    //When
    testHuman.eat(testfruit1);
    testHuman.eat(testfruit2);
    testHuman.eat(testFruit3);
    int actualEnergy = testHuman.getEnergy();
    //Then 
    Assert.assertEquals(100, actualEnergy);
}
@Test
public void workMin(){

    //Given
    Human testHuman = new Human("Pebbles", "Flinstone");
    //When 
    testHuman.work(6);
    int actualEnergy = testHuman.getEnergy();
    //Then
    Assert.assertEquals(50, actualEnergy);
}

@Test
public void maxEnergyChangeTest () 
{
//Given
 Human h1 = new Human("Jane", "Doe");
Fruit testfFruit1 = new Fruit("Dragon Fruit", 20);
Fruit testfFruit2 = new Fruit("Orange", 20);
Fruit testfFruit3 = new Fruit("Apple", 20);
 Human.maxEnergy = 150;

h1.eat(testfFruit1);
h1.eat(testfFruit2);
h1.eat(testfFruit3);
 //When 
int actualEnergy = h1.getEnergy();
//then
 Assert.assertEquals(110,actualEnergy);
Human.maxEnergy = 100; 
}

}