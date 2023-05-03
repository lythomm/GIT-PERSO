#!/bin/bash
if test -s $1
	then
		if test -r $1 -a -w $1
			then
				echo Le fichier existe et il est accessible en lecture et écriture
			else
				echo Le fichier n\'est pas accessible en lecture et écriture
		fi
	else
		echo Le fichier n\'existe pas
fi

