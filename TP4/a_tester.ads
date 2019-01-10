with tests; use tests;
with Ada.Strings.Unbounded; use Ada.Strings.Unbounded;

package a_Tester is

   function test_P1 return Boolean;
   function test_P2 return Boolean;
   function test_P3 return Boolean;
   function test_P4 return Boolean;
   function test_P5 return Boolean;
   function test_P6a return Boolean;
   function test_P6b return Boolean;
   function test_P7a return Boolean;
   function test_P7b return Boolean;
   function test_P8 return Boolean;
   function test_P9a return Boolean;
   function test_P9b return Boolean;
   function test_P10 return Boolean;
   function test_P11a return Boolean;
   function test_P11b return Boolean;
   function test_Precond return Boolean;

   les_Tests : constant array (Positive range <>) of Test_Unitaire :=
     ((test_P1'Access, To_Unbounded_String("echec de la propriété 1")),
      (test_P2'Access, To_Unbounded_String("echec de la propriété 2")),
      (test_P3'Access, To_Unbounded_String("echec de la propriété 3")),
      (test_P4'Access, To_Unbounded_String("echec de la propriété 4")),
      (test_P5'Access, To_Unbounded_String("echec de la propriété 5")),
      (test_P6a'Access, To_Unbounded_String("echec de la propriété 6a")),
      (test_P6b'Access, To_Unbounded_String("echec de la propriété 6b")),
      (test_P7a'Access, To_Unbounded_String("echec de la propriété 7a")),
      (test_P7b'Access, To_Unbounded_String("echec de la propriété 7b")),
      (test_P8'Access, To_Unbounded_String("echec de la propriété 8")),
      (test_P9a'Access, To_Unbounded_String("echec de la propriété 9a")),
      (test_P9b'Access, To_Unbounded_String("echec de la propriété 9b")),
      (test_P10'Access, To_Unbounded_String("echec de la propriété 10")),
      (test_P11a'Access, To_Unbounded_String("echec de la propriété 11a")),
      (test_P11b'Access, To_Unbounded_String("echec de la propriété 11b")),
      (test_Precond'Access, TO_Unbounded_String("echec de la précondition")));

   resultats : array(les_Tests'Range) of Boolean;

end a_Tester;
