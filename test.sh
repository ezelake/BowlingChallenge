mvn clean package
cd target/classes
for FILE in `ls ../../src/test/input/*/*.txt`; do
  echo Test file: `basename $FILE`
  java ceq/bowling/App $FILE
  echo Exit code: $?
  echo "---------------------------------------------------------------------------"
done

