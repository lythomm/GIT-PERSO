#!/bin/bash
effacer_fichier () {
	rm -i $suppr
}
for fich in `ls *.log` 
do
	suppr=`find -name "*.log"`
	effacer_fichier $suppr
done
