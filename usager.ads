package usager is
-- définition des constantes
LONGUEUR_NOM : constant Integer := 20;

-- définition des types
type EnrUsager is record
        numero_adherent : Integer;
	nom : String (1..LONGUEUR_NOM);
	longueur1: Integer;
	annee_naissance : Integer;
end record;

-- lit le nom et le numéro d'adhérent de l'usager
procedure lire_usager (usager: out EnrUsager);

-- écrit le nom et le numéro d'adhérent de l'usager
procedure ecrire_usager (usager: in EnrUsager);

-- calcule l'âge de l'usager
function age_usager (usager: in EnrUsager) return Integer;

end usager;
