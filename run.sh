mvn clean package
cd target/classes
java ceq/bowling/App ../../src/test/input/bowl-2p.txt
echo $?
