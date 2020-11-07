mvn clean package
cd target/classes
java ceq/bowling/App ../..//src/test/input/bowl-1p.txt
echo $?
