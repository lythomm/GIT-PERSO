with Ada.Text_IO; use Ada.Text_IO;
with Ada.Integer_Text_IO; use Ada.Integer_Text_IO;
with usager; use usager;

procedure test_usager is

-- glossaire
	usager : EnrUsager;
	age : Integer ;

begin
   lire_usager(usager) ;
   New_Line;
   ecrire_usager(usager) ;
   age := age_usager(usager) ;
   put ("L'age de l'usager est de ");
   put(age,0) ;
   put(" ans");
end test_usager;
