#!/bin/bash
cd src/main/java
javac ir/ac/kntu/Main.java
java ir.ac.kntu.Main
rm ir/ac/kntu/*.class
rm ir/ac/kntu/logic/*.class
rm ir/ac/kntu/util/*.class
rm ir/ac/kntu/gamelogic/*.class