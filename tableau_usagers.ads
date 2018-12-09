package tableau_usagers is
-- définition des constantes
LONGUEUR_NOM : constant Integer := 20;
TAILLE_MAX : constant Integer := 100;

-- définition des types
type EnrUsager is record
        numero_adherent : Integer;
	nom : String (1..LONGUEUR_NOM);
	longueur1: Integer;
	annee_naissance : Integer;
end record;
type Tab_usagers is array (1..TAILLE_MAX) of EnrUsager ;

-- lit le nom et le numéro d'adhérent de l'usager
procedure lire_usager (usager: out EnrUsager);

-- écrit le nom et le numéro d'adhérent de l'usager
procedure ecrire_usager (usager: in EnrUsager);

end tableau_usagers;
