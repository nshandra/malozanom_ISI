#!/bin/bash
hamcrest="/home/kilo/ISI/3-Tests/Practica-ISI/pruebasIDM/hamcrest-core-1.3.jar"
junit="/home/kilo/ISI/3-Tests/Practica-ISI/pruebasIDM/junit-4.12.jar"

if [[ -f "$hamcrest" ]] && [[ -f "$junit" ]]; then
	javac -cp .:"$hamcrest":"$junit" EmbotelladoraTest.java
	javac -cp .:"$hamcrest":"$junit" AllTests.java
	java -cp .:"$hamcrest":"$junit" AllTests
else
	echo "Error. JUnit libs not in Practica-ISI/pruebasIDM"
fi