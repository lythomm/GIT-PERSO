#!/bin/bash
if `test -s $1 -a -s $2`
	then
		echo Souhaitez-vous concaténer les fichier ?
		read rep
		if [ rep = "oui" ]
			then
				cat $1 >> $2
				cat $2
			else
				echo Fichier non concaténés
		fi
	else
		echo Les fichiers ou un des fichiers n\'existent pas
fi
