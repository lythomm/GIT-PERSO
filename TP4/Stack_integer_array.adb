package body Stack_integer_array is

   ----------------
   -- initialize --
   ----------------

   function initialize (In_size_max : in Natural) return Bounded_Stack is
      pile : Bounded_Stack;
   begin
      pile.Maximum_Size :=
   end initialize;

   ----------
   -- Push --
   ----------

   procedure Push (stack : in out Bounded_Stack; In_Data : in Integer) is
   begin

   end Push;

   --------------
   -- Is_Empty --
   --------------

   function Is_Empty (stack : in Bounded_Stack) return Boolean is
   begin

   end Is_Empty;

   ------------------------
   -- Maximal_Stack_Size --
   ------------------------

   function Maximal_Stack_Size (stack : in Bounded_Stack) return Natural is
   begin

   end Maximal_Stack_Size;

   ------------------------
   -- Current_Stack_Size --
   ------------------------

   function Current_Stack_Size (stack : in Bounded_Stack) return Natural is
   begin

   end Current_Stack_Size;

   -------------
   -- Is_Full --
   -------------

   function Is_Full (stack : in  Bounded_Stack) return Boolean is
   begin

   end Is_Full;

   ---------
   -- Top --
   ---------

   function Top (stack : in Bounded_Stack) return Integer is
   begin

   end Top;

   ---------
   -- Pop --
   ---------

   procedure Pop (stack : in out Bounded_Stack) is
   begin

   end Pop;

end Stack_integer_array;
