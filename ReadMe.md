# U6S5 - Object Interaction

* Part A - Foundations 7.5
* Part B - Foundations Practice

## Part A

### Exercise 01

* Continue editing the PlayerTest project
* A version of this program is provided for you in the files
 `Player` and `PlayerTest`

#### Step 01

In the package `partA` look at the file `Team`

#### Step 02
* Create a `Team` class that includes the following:
  * String name of the team
  * Boolean describing whether the team is recruiting or not 
  * Two-argument constructor that sets both fields

#### Step 03
* Modify the `Player` class so that it:
  * Includes a Team field
  * Sets the Team field based on a constructor parameter
  * Prints the team's name as part of the display() method

#### Step 04
* Write an teamRecruitment() method in the `Player` class
  * Access and modify the corresponding field in the Team object
  so that:
  * If the team is recruiting, allow tryouts
  * If the team is not recruiting, don't allow tryouts
  * Print whether there are tryouts or not

#### Step 05
* From the main method:
  * Instantiate a Team and a Player object
  * Call the player's display() method once
  * Call the teamRecruitment() method a few times

Your program is working correctly, if when run, the following is the output:

```
Name: LeBron
Height: 2.08
yearsInLeague: 20
Team: Lakers
Team Lakers Tryouts
Team Lakers No tryouts
Team Lakers Tryouts

```

#### Step 06
*  Modify the `Team` class:
  * Change its fields to private
  * Save the file

## Part B
### Exercise 01

#### Step 01

In the package `partA.ex01` look at the file `Team`.

#### Step 02

* Modify the `Team` class so that ...
  * Getters exist for the name and teamRecruitment fields
  * There’s a private 4-digit recruitment code field for each team, it’s initialized from the constructor and has no getter method
  * There’s a setter for tryouts/no tryouts, and it does the following:
    *  Accepts a recruitment code as an argument
    * Prints if the code is incorrect
    *  If the code is correct and the team is not having tryouts, start tryouts
      *  If the code is correct and team is having tryouts, cancel it
      * Prints if the team is having tryouts or not
    
  Your program is working correctly, if when run, the following is the output:

```
Name: LeBron
Height: 2.08
yearsInLeague: 20
Team: Lakers
Incorrect code
Team Lakers Tryouts
Team Lakers No tryouts

```

#### Step 03
* Modify the `Player` class so that …
  * The display() method prints the team name
  * The teamRecruitment() method is removed
* Modify the main method so that …
  * The Team is instantiated properly
  * The player no longer tries to get recruited
  * It tests a Team class’s ability to recruit or not recruit
  *  Try supplying both correct and incorrect recruitment codes

#### Step 04
* Encapsulate the `Player` class
  * Make its fields private
  * Provide getters and setters for every field

