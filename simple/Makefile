all:build jar  run 


build:
	@echo "==Pack==" 
	javac -d . *.java 

run: 
	@echo "==RUN CLASS=="
	java  mypack.A
	java  mypack1.Test
	@echo "==RUN JAR=="
	java -jar myjar.jar

jar:
	@echo "==JAR=="
	jar cvfm myjar.jar Manifest.txt mypack/* mypack1/* -C images .
	
#https://docs.oracle.com/javase/tutorial/deployment/jar/build.html