#!/bin/bash
fac=1
for i in `seq $1`
do
	fac=$(($i * $fac))
	
done
echo $fac
