clean:
	find . -name "*.class" -type f -delete
build:
	make clean && javac Main.java
run: 
	make build && java Main