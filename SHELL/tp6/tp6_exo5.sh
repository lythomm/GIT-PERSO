#!/bin/bash
num=0
for i in $*
do
	num=$(($num + 1))
	echo argument $num \= $i
done
echo il y a $# argument\(s\).
