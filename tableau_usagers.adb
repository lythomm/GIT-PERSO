with Ada.Text_IO; use Ada.Text_IO;
with Ada.Integer_Text_IO; use Ada.Integer_Text_IO;

package body tableau_usagers is

   -----------------
   -- lire_usager --
   -----------------

   procedure lire_usager (usager: out EnrUsager) is
   begin
      Put_Line("Quel est le numero d'adherent de l'usager ?");
      Get(usager.numero_adherent);
      Skip_Line;
      Put_Line("Quel est le nom de l'usager ?");
      Get_Line(usager.nom, usager.longueur1);
      Put_Line("Quelle est l'annee de naissance de l'usager ?");
      Get(usager.annee_naissance);
   end lire_usager;

   -------------------
   -- ecrire_usager --
   -------------------

   procedure ecrire_usager (usager: in EnrUsager) is
   begin
      Put("Le numero d'adherent de l'usager est ");
      Put(usager.numero_adherent,0);
      New_Line;
      Put("Son nom est ");
      Put(usager.nom(1..usager.longueur1));
      New_Line;
      Put("Son annee de naissance est ");
      Put(usager.annee_naissance,0);
      New_Line;
   end ecrire_usager;

end tableau_usagers;
