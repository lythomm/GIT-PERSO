#!/bin/bash
if test $1 -gt 5 -a $1 -lt 10
	then
		echo $1 est compris entre 5 et 10
	else
		echo $1 n\'est pas compris entre 5 et 10
fi
