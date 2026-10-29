# javaGuesser

```mermaid 

classDiagram

class main{
    menu function
    ask user 1 for userGuesses, 2 for botGuesses, 0 quit
    if 1, run userGuesses
    if 2, run botGuesses 
}

class userGuesses{
    generate random number 1-100 (correct)
    prompt user to guess a number 
    if number is higher than correct, print "Too high!"
    if number is lower than correct, print "Too low!"
    if number is equal to correct, print "You got it!" 
    -
    keep track of turns, print result at end 
}

class botGuesses{
    intro
    prompt user for "too high", "too low", or "correct"

    if too high, take # of numbers below guess and / 2
    - use as next guess
    if too low, take # of numbers above guess and / 2
    - use as next guess 
    if correct, stop
}
```

## Bot Guesses

- Make ints high and low, default to 100 and 0 respectively
- First guess sum of high and low divided by 2 (50)
- If computer's guess is too high, make 50 the high
- Again, sum of high and low divided by 2, repeat till correct
- Do the same thing but reversed if number is too low (make 50 the low)
- Turn count++ 
