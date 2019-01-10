with alea;                use alea;
with Stack_integer_array; use Stack_integer_array;
with Ada.Text_IO; use Ada.Text_IO;

package body a_Tester is

   -- générateur de nombres aléatoires
   g : Generator;
   taille_Pile : constant := 3;

   -- verifie que la pile crée est vide
   function test_P1 return Boolean is
      pile : Bounded_Stack;
   begin
      pile := initialize (taille_Pile);
      return (Is_Empty (pile));
   exception
      when others =>
         return False;
   end test_P1;

   -- verifie que la pile n'est pas vide
   -- lorsque on ajoute un élément à la pile
   function test_P2 return Boolean is
      pile : Bounded_Stack;
   begin
      pile := initialize (taille_Pile);
      Push (pile, random(g));
      return not Is_Empty (pile);
   exception
      when others =>
          return False;
  end test_P2;

   -- verifie que la taille de la pile est égale à la taille maximale qu'elle peut atteindre
   -- lorsque créer la pile
   function test_P3 return Boolean is
      pile : Bounded_Stack;
   begin
      pile := initialize (taille_Pile);
      return Maximal_Stack_Size (pile) = taille_Pile;
   exception
      when others =>
         return False;
   end test_P3;

   -- verifie que la taille de la pile est égale à la taille maximale qu'elle peut atteindre
   -- lorsque créer la pile et qu'on ajoute un élément
   function test_P4 return Boolean is
      pile : Bounded_Stack;
   begin
      pile := initialize (taille_Pile);
      Push (pile, random(g));
      return Maximal_Stack_Size (pile) = taille_Pile;
   exception
      when others =>
         return False;
   end test_P4;

   -- verifie que la pile est vide
   -- lorsque on créer la pile
   function test_P5 return Boolean is
      pile : Bounded_Stack;
   begin
      pile := initialize (taille_Pile);
      return Current_Stack_Size (pile) = 0;
   exception
      when others =>
         return False;
   end test_P5;

   -- verifie qu'il n'y a qu'un seul élément dans la pile
   -- lorsqu'on ajoute un élement dans la pile
   function test_P6a return Boolean is
      pile : Bounded_Stack;
   begin
      pile := initialize (taille_Pile);
      Push (pile, random(g));
      return Current_Stack_Size (pile) = 1;
   exception
      when others =>
         return False;
   end test_P6a;

   -- verifie que la pile est pleine
   -- lorsqu'on créer la pile et que l'on ajoute un nombre d'éléments égal à la taille max de la pile
   function test_P6b return Boolean is
      pile : Bounded_Stack;
   begin
      pile := initialize (taille_Pile);
      for i in 1 .. taille_Pile loop
         Push (pile, random(g));
      end loop;
      Push (pile, random(g));
      return Current_Stack_Size (pile) = taille_Pile;
   exception
      when others =>
         return False;
   end test_P6b;

   -- verifie que la pile est pleine
   -- lorsqu'on créer la pile
   function test_P7a return Boolean is
      pile : Bounded_Stack;
   begin
      pile := initialize (0);
      return Is_Full (pile);
   exception
      when others =>
         return False;
   end test_P7a;

   -- verifie que la pile n'est pas pleine
   -- lorsqu'on créer la pile
   function test_P7b return Boolean is
      pile : Bounded_Stack;
   begin
      pile := initialize (taille_Pile);
      return not Is_Full (pile);
   exception
      when others =>
         return False;
   end test_P7b;

   -- verifie que la pile est pleine
   -- lorsqu'on la remplie
   function test_P8 return Boolean is
      pile : Bounded_Stack;
   begin
      pile := initialize (taille_Pile);
      for i in 1 .. taille_Pile loop
         Push (pile, random(g));
      end loop;
      return Is_Full (pile);
   exception
      when others =>
         return False;
   end test_P8;

   -- verifie que
   -- lorsque
   function test_P9a return Boolean is
      pile : Bounded_Stack;
      var : Integer ;
   begin
      pile := initialize (taille_Pile);
      var := random(g);
      Push (pile, var);
      return Top (pile) = var;
   exception
      when others =>
         return False;
   end test_P9a;

   function test_P9b return Boolean is
      pile : Bounded_Stack;
      var : Integer ;
   begin
      pile := initialize (taille_Pile);
      for i in 1 .. taille_Pile loop
         var := random(g);
         Push (pile,var );
      end loop;
      Push (pile,random(g));
      return Top (pile) = var;
   exception
      when others =>
         return False;
   end test_P9b;

   function test_P10 return Boolean is
      pile : Bounded_Stack;
   begin
      pile := initialize (taille_Pile);
      Pop (pile);
      return (Is_Empty (pile));
   exception
      when others =>
         return False;
   end test_P10;

   function test_P11a return Boolean is
      pile : Bounded_Stack;
   begin
      pile := initialize (taille_Pile);
      Push (pile, random(g));
      Pop (pile);
      return (Is_Empty (pile));
   exception
      when others =>
         return False;
   end test_P11a;

   function test_P11b return Boolean is
      pile : Bounded_Stack;
      var : Integer;
   begin
      pile := initialize (taille_Pile);
      for i in 1 .. taille_Pile - 2 loop
         Push (pile, random(g));
      end loop;
      var := random(g);
      Push (pile, var);
      Push (pile, random(g));
      Push (pile, random(g));
      Pop (pile);
      return Top (pile) = var;
   exception
      when others =>
         return False;
   end test_P11b;

   function test_Precond return Boolean is
      pile : Bounded_Stack;
      t    : Integer;
   begin
      pile := initialize (taille_Pile);
      t    := Top (pile);
      return False;
   exception
      when top_empty_stack =>
         return True;
      when others =>
         return False;
   end test_Precond;

begin
   -- instructions d'initialisation du paquetage
   -- initialisation du générateur de nombre aléatoire
   Reset (g);
end a_Tester;
