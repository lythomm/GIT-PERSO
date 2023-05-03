#!/bin/bash
fac () {
	fact=1
	for i in `seq $1`
	do
		fact=$(($i * $fact))
	done
	echo $fact
}
fac $1
