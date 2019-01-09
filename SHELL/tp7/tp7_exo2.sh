#!/bin/bash
calcul () {
	rep=$(($*))
}

echo "Script Principal"
calcul $*
echo $rep
echo "Fin du script principal"
