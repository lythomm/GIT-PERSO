#!/bin/bash
var1=1
var2=2
var3=3
var4=4
echo Liste des commandes disponibles :
echo -e "1 - Date du jour\n2 - Liste des personnes connectées sur la machine\n3 - Liste des fichiers du répertoires courant\n4 - Nom du répertoire courant"
echo Faites votre Choix \:
read rep
while [ $rep -lt "5" ]
do 
	case $rep in
		1 ) echo `date` ;;
		2 ) echo `who` ;;
		3 ) echo "`ls -l`" ;;
		4 ) echo `pwd` ;;
	esac
	echo Faites votre choix \:
	read rep
done
