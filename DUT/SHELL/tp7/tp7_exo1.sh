#!/bin/bash
fct(){
   var2="variable 2"
   echo "Dans fonction"
   echo "\$1 = $1"
   echo "var1 = $var1"
   echo "var2 = $var2"
   echo "fin fonction"
}
var1="variable 1"
echo "dans script principal"
echo "\$1 = $1"
echo "var1 = $var1"
fct $var1
echo "var2 = $var2"
echo "fin script principal"
