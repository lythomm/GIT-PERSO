#!/bin/bash
echo Quelle est votre année de naissance \?
read annee
echo Vous êtes né\(e\) en $annee, vous avez donc $(( `date +%Y` - $annee )) ans. 
