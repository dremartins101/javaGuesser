Guesser.class: NumberGuesser.java
	javac -g NumberGuesser.java

run: NumberGuesser.class
	java NumberGuesser

clean:
	rm *.class
